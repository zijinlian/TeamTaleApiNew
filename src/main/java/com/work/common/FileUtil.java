package com.work.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.work.common.ApiLog;
import com.work.common.Constants;
import com.work.common.FileUtil;

/**
 * 文件工具类
 * 
 * @author 孙宇
 * 
 */
public class FileUtil {
	private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);

	private final static int BUFFER = 1024;

	/**
	 * 功 能: 移动文件(只能移动文件) 参 数: strSourceFileName:指定的文件全路径名 strDestDir: 移动到指定的文件夹 返回值: 如果成功true;否则false
	 * 
	 * @param strSourceFileName
	 * @param strDestDir
	 * @return
	 */
	public static boolean copyTo(String strSourceFileName, String strDestDir) {
		File fileSource = new File(strSourceFileName);
		File fileDest = new File(strDestDir);

		// 如果源文件不存或源文件是文件夹
		if (!fileSource.exists() || !fileSource.isFile()) {
			logger.debug("源文件[" + strSourceFileName + "],不存在或是文件夹!");
			return false;
		}

		// 如果目标文件夹不存在
		if (!fileDest.isDirectory() || !fileDest.exists()) {
			if (!fileDest.mkdirs()) {
				logger.debug("目录文件夹不存，在创建目标文件夹时失败!");
				return false;
			}
		}

		try {
			String strAbsFilename = strDestDir + File.separator + fileSource.getName();

			FileInputStream fileInput = new FileInputStream(strSourceFileName);
			FileOutputStream fileOutput = new FileOutputStream(strAbsFilename);

			logger.debug("开始拷贝文件");

			int count = -1;

			long nWriteSize = 0;
			long nFileSize = fileSource.length();

			byte[] data = new byte[BUFFER];

			while (-1 != (count = fileInput.read(data, 0, BUFFER))) {

				fileOutput.write(data, 0, count);

				nWriteSize += count;

				long size = (nWriteSize * 100) / nFileSize;
				long t = nWriteSize;

				String msg = null;

				if (size <= 100 && size >= 0) {
					msg = "\r拷贝文件进度:   " + size + "%   \t" + "\t   已拷贝:   " + t;
					logger.debug(msg);
				} else if (size > 100) {
					msg = "\r拷贝文件进度:   " + 100 + "%   \t" + "\t   已拷贝:   " + t;
					logger.debug(msg);
				}

			}

			fileInput.close();
			fileOutput.close();

			logger.debug("拷贝文件成功!");
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 功 能: 删除指定的文件 参 数: 指定绝对路径的文件名 strFileName 返回值: 如果删除成功true否则false;
	 * 
	 * @param strFileName
	 * @return
	 */
	public static boolean delete(String strFileName) {
		File fileDelete = new File(strFileName);

		if (!fileDelete.exists() || !fileDelete.isFile()) {
			logger.debug(strFileName + "不存在!");
			return false;
		}

		return fileDelete.delete();
	}

	/**
	 * 功 能: 移动文件(只能移动文件) 参 数: strSourceFileName: 是指定的文件全路径名 strDestDir: 移动到指定的文件夹中 返回值: 如果成功true; 否则false
	 * 
	 * @param strSourceFileName
	 * @param strDestDir
	 * @return
	 */
	public static boolean moveFile(String strSourceFileName, String strDestDir) {
		if (copyTo(strSourceFileName, strDestDir))
			return delete(strSourceFileName);
		else
			return false;
	}

	/**
	 * 功 能: 创建文件夹 参 数: strDir 要创建的文件夹名称 返回值: 如果成功true;否则false
	 * 
	 * @param strDir
	 * @return
	 */
	public static boolean makeDir(String strDir) {
		File fileNew = new File(strDir);

		if (!fileNew.exists()) {
			return fileNew.mkdirs();
		} else {
			return true;
		}
	}

	/**
	 * 功 能: 删除文件夹 参 数: strDir 要删除的文件夹名称 返回值: 如果成功true;否则false
	 * 
	 * @param strDir
	 * @return
	 */
	public static boolean removeDir(String strDir) {
		File rmDir = new File(strDir);
		if (rmDir.isDirectory() && rmDir.exists()) {
			String[] fileList = rmDir.list();

			for (int i = 0; i < fileList.length; i++) {
				String subFile = strDir + File.separator + fileList[i];
				File tmp = new File(subFile);
				if (tmp.isFile())
					tmp.delete();
				else if (tmp.isDirectory())
					removeDir(subFile);
			}
			rmDir.delete();
		} else {
			return false;
		}
		return true;
	}
	
	/**
	 * 根据传入的文件file获取文件的后缀名
	 * @param file
	 * @return
	 */
	public static String getFormatForFile(File file) {
		String imageName = file.getName();
		int lastIndex = imageName.lastIndexOf(".");
		return imageName.substring(lastIndex+1, imageName.length());
	}
	
	
	/**
	 * 根据SPRINGMVC传入的文件MultipartFile获取文件的后缀名
	 * @param file
	 * @return
	 */
	public static String getFormatForFile(MultipartFile file) {
		String imageName = file.getOriginalFilename();
		int lastIndex = imageName.lastIndexOf(".");
		return imageName.substring(lastIndex+1, imageName.length());
	}
	
	/**
	 * 根据SPRINGMVC传入的文件
	 * @param file
	 * @return
	 */
	public static String getFormatForFileName(MultipartFile file) {
		return  file.getOriginalFilename();
	}
	
	
	/**
     * 创建目录
     * 
     * @param dir 目录
     */
    public static void mkdir(String dir) {
        try {
            String dirTemp = dir;
            File dirPath = new File(dirTemp);
            if (!dirPath.exists()) {
                dirPath.mkdir();
            }
        } catch (Exception e) {
        	logger.error("创建目录操作出错: "+e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * 新建文件
     * 
     * @param fileName
     *            String 包含路径的文件名 如:E:\phsftp\src\123.txt
     * @param content
     *            String 文件内容
     *            
     */
    public static void writeStringToFile(String fileName, ApiLog log) {
        try {
        	StringBuffer url = new StringBuffer(fileName);
        	url.append(log.getProject());
        	if(StringUtils.isNoneEmpty(log.getControllerName())){
        		url.append("_"+log.getControllerName());
        	}
        	url.append("_api.txt");
        	//判断文件中是否存在接口
        	File file = new File(url.toString());
        	if(!file.isFile()){
        		FileUtils.write(file, null);
        	}
        	List<String> list = FileUtils.readLines(file,"GBK");
        	int index = list.indexOf(log.getRemark());
        	if(index != -1){//当文本中存在该接口，就重新覆盖
        		list.remove(index);
        		list.add(index,log.getRemark());
        		list.remove(index+1);
        		list.add(index+1,log.getUrl());
        		list.remove(index+2);
        		list.add(index+2,log.getParam());
        		list.remove(index+3);
        		list.add(index+3,log.getResponse());
        		FileUtils.writeLines(file, list);
        	}else{
        		FileUtils.writeStringToFile(file, log.getRemark()+"\r\n", "GBK", true);
        		FileUtils.writeStringToFile(file, log.getUrl()+"\r\n", "GBK", true);
        		FileUtils.writeStringToFile(file, log.getParam()+"\r\n", "GBK", true);
        		FileUtils.writeStringToFile(file, log.getResponse()+"\r\n", "GBK", true);
        	}
        } catch (Exception e) {
        	logger.error("新建文件操作出错: "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void findStringFile() throws IOException{
    	mkdir(Constants.API_FILE_URL);
    	File file = new File("C:\\logs\\1.txt");
    	if (!file.exists()) {
    		file.mkdirs();
		}
    	List<String> list = FileUtils.readLines(file,"GBK");
    	int index = list.indexOf("[remark]登录1");
    	System.out.println(index);
    	//list.add(5, "");
    }
    
    
    public static void main(String[] args) throws IOException {
    	findStringFile();
	}
	
}
