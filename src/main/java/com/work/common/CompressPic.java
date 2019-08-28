package com.work.common;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.work.common.CompressPic;
import com.work.common.FileUtil;

/*******************************************************************************
 * 缩略图类（通用） 本java类能将jpg、bmp、png、gif图片文件，进行等比或非等比的大小转换。 具体使用方法
 * compressPic(大图片路径,生成小图片路径,大图片文件名,生成小图片文名,生成小图片宽度,生成小图片高度,是否等比缩放(默认为true))
 */
@SuppressWarnings("unused")
public class CompressPic {
	private File file = null; // 文件对象
	private String inputDir; // 输入图路径
	private String outputDir; // 输出图路径
	private String inputFileName; // 输入图文件名
	private String outputFileName; // 输出图文件名
	private int outputWidth = 100; // 默认输出图片宽
	private int outputHeight = 100; // 默认输出图片高
	private boolean proportion = true; // 是否等比缩放标记(默认为等比缩放)

	public CompressPic() { // 初始化变量
		inputDir = "";
		outputDir = "";
		inputFileName = "";
		outputFileName = "";
		outputWidth = 100;
		outputHeight = 100;
	}

	public void setInputDir(String inputDir) {
		this.inputDir = inputDir;
	}

	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	public void setOutputWidth(int outputWidth) {
		this.outputWidth = outputWidth;
	}

	public void setOutputHeight(int outputHeight) {
		this.outputHeight = outputHeight;
	}

	public void setWidthAndHeight(int width, int height) {
		this.outputWidth = width;
		this.outputHeight = height;
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	/*
	 * 获得图片大小 传入参数 String path ：图片路径
	 */
	public long getPicSize(String path) {
		file = new File(path);
		return file.length();
	}

	// 图片处理
	public String compressPic() {
		try {
			// 获得源文件
			// file = new File(inputDir + inputFileName);
			if (!file.exists()) {
				return "";
			}
			BufferedImage img = ImageIO.read(file);
			if (outputWidth == 0) {
				outputWidth = img.getWidth(null);
				outputHeight = img.getHeight(null);
			}
			// 判断图片格式是否正确
			if (img.getWidth(null) == -1) {
				return "no";
			} else {
				int newWidth;
				int newHeight;
				// 判断是否是等比缩放
				if (this.proportion == true) {
					// 为等比缩放计算输出的图片宽度及高度
					double rate1 = ((double) img.getWidth(null))
							/ (double) outputWidth + 0.1;
					double rate2 = ((double) img.getHeight(null))
							/ (double) outputHeight + 0.1;
					// 根据缩放比率大的进行缩放控制
					double rate = rate1 > rate2 ? rate1 : rate2;
					newWidth = (int) (((double) img.getWidth(null)) / rate);
					newHeight = (int) (((double) img.getHeight(null)) / rate);
				} else {
					newWidth = outputWidth; // 输出的图片宽度
					newHeight = outputHeight; // 输出的图片高度
				}
				
				
				File file = new File(outputDir + outputFileName);
				String fix = FileUtil.getFormatForFile(file);
				if(fix.equalsIgnoreCase("png")){
					BufferedImage tag = new BufferedImage((int) newWidth,
							(int) newHeight, BufferedImage.TYPE_INT_RGB);
					
					Graphics2D g2d = tag.createGraphics();   
					
					tag = g2d.getDeviceConfiguration().createCompatibleImage(newWidth, newHeight,   
		                    Transparency.TRANSLUCENT);   
					
					 g2d.dispose();   
					/*
					 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 优先级比速度高 生成的图片质量比较好 但速度慢
					 */
					tag.getGraphics().drawImage(
							img.getScaledInstance(newWidth, newHeight,
									Image.SCALE_DEFAULT), 0, 0, null);
					
					File outFile = new File(outputDir);
					if(!outFile.exists()){
						outFile.mkdirs();
					}
					ImageIO.write(tag, fix, file);  
				}else{
					BufferedImage tag = new BufferedImage((int) newWidth,
							(int) newHeight, BufferedImage.TYPE_INT_RGB);
					/*
					 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 优先级比速度高 生成的图片质量比较好 但速度慢
					 */
					tag.getGraphics().drawImage(
							img.getScaledInstance(newWidth, newHeight,
									Image.SCALE_SMOOTH), 0, 0, null);
					
					File outFile = new File(outputDir);
					if(!outFile.exists()){
						outFile.mkdirs();
					}
					if (!outFile.exists()){
						outFile.mkdir();
					}
					
					// JPEGImageEncoder可适用于其他图片类型的转换
					
					/*FileOutputStream out = new FileOutputStream(outputDir + outputFileName);
					JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
					JPEGEncodeParam jep=JPEGCodec.getDefaultJPEGEncodeParam(tag); 
					jep.setQuality(100, true); 
					encoder.encode(tag);*/
					String dstName = outputDir + outputFileName;
					String formatName = dstName.substring(dstName.lastIndexOf(".") + 1);
					ImageIO.write(tag, formatName, new File(dstName));
					//out.close();
				}
				
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return "ok";
	}

	
	
	public String compressPic(String inputDir, String outputDir,
			String inputFileName, String outputFileName) {
		// 输入图路径
		this.inputDir = inputDir;
		// 输出图路径
		this.outputDir = outputDir;
		// 输入图文件名
		this.inputFileName = inputFileName;
		// 输出图文件名
		this.outputFileName = outputFileName;
		return compressPic();
	}

	/**
	 * 
	 * @param file  传入的文件
	 * @param inputDir  输入图路径
	 * @param outputDir 输出图路径
	 * @param inputFileName 输入图文件名
	 * @param outputFileName 输出图文件名
	 * @param width  设置图片宽
	 * @param height 设置图片高
	 * @param gp 是否等比压缩
	 * @return
	 */
	public String compressPic(File file, String inputDir, String outputDir,
			String inputFileName, String outputFileName, int width, int height,
			boolean gp) {
		
		this.inputDir = inputDir;
		
		this.outputDir = outputDir;
		// 
		this.inputFileName = inputFileName;
		// 
		this.outputFileName = outputFileName;
		// 
		setWidthAndHeight(width, height);
		// 是否是等比缩放 标记
		this.proportion = gp;

		this.file = file;
		return compressPic();
	}

	// main测试
	// compressPic(大图片路径,生成小图片路径,大图片文件名,生成小图片文名,生成小图片宽度,生成小图片高度,是否等比缩放(默认为true))
	public static void main(String[] arg) {
		CompressPic mypic = new CompressPic();

		File file = new File("d:\\2.png");
		try {
			Image img = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long startTime = System.currentTimeMillis();
		mypic.compressPic(file, "", "d:\\test\\", "", "hha" + ".jpg", 100,100, true);
		mypic.compressPic(file, "", "d:\\test\\", "", "hha2" + ".jpg", 200,200, true);
		long endTime = System.currentTimeMillis();
	}
}