package com.work.bean;


public class VersionUpdateBean {
	private String phoneType;//手机类型
	private String version;//手机版本号
	
    private String androidVersion;

    private String androidContent;

    private String iosContent;

    private String iosVersion;
    
    private String androidUrl;
    
    private String iosUrl;
    
	public String getAndroidUrl() {
		return androidUrl;
	}

	public void setAndroidUrl(String androidUrl) {
		this.androidUrl = androidUrl;
	}

	public String getIosUrl() {
		return iosUrl;
	}

	public void setIosUrl(String iosUrl) {
		this.iosUrl = iosUrl;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getAndroidContent() {
		return androidContent;
	}

	public void setAndroidContent(String androidContent) {
		this.androidContent = androidContent;
	}

	public String getIosContent() {
		return iosContent;
	}

	public void setIosContent(String iosContent) {
		this.iosContent = iosContent;
	}

	public String getIosVersion() {
		return iosVersion;
	}

	public void setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
