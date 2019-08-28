package com.work.common;

import java.io.File;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.work.common.CompressPic;
import com.work.common.ContextHolderUtils;
import com.work.common.DateUtil;
import com.work.common.FileUtil;

public class ConvertImage {
	
	//public static String upload_url = ResourceUtil.getUploadUrl();
	
	public static int[] imageSizeArr = {80,256};
	
	/**
	 * api上传图片
	 * 
	 * @param file
	 * @return 相对路径
	 */
	public static String uploadImage(MultipartFile file) {
		try {
			String basePath = ContextHolderUtils.getContextPath();
			String savePath = "/upload/image";// 服务器图片地址
			String saveRelativePath = "/upload/image";//服务器图片相对地址用于存数据库
			savePath = basePath + savePath + "/" + DateUtil.defaultFormat(new Date(), "yyyyMMdd");
			saveRelativePath =  saveRelativePath +"/" + DateUtil.defaultFormat(new Date(), "yyyyMMdd");
			long sysTime = System.currentTimeMillis();
			// 获得File后缀名
			String fixString = FileUtil.getFormatForFile(file);
			File outFile = new File(savePath);
			if (!outFile.exists()) {
				outFile.mkdirs();
			}
			CompressPic compressPic = new CompressPic();
			File originalFile = new File(savePath + "/" + sysTime+"."+ fixString);
			file.transferTo(originalFile);
			for (int i = 0; i < imageSizeArr.length; i++) {
				compressPic.compressPic(originalFile, "", savePath + "/", "",sysTime + "_" + imageSizeArr[i] + "." + fixString,imageSizeArr[i], imageSizeArr[i], true);
			}
			return saveRelativePath + "/" + sysTime + "." + fixString;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
