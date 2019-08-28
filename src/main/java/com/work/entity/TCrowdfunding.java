package com.work.entity;

import org.apache.commons.lang3.StringUtils;

import com.work.common.DateUtil;

public class TCrowdfunding {
    private String fdCfId;

    private String fdTheme;

    private String fdContent;

    private String fdCfTypeId;

    private String fdReleasedep;

    private String fdStarttime;

    private String fdEndtime;

    private String fdLikecount;

    private String fdState;

    private String fdTop="0";

    private String fdCficon;

    private String fdCreaterid;

    private String fdDisCount;

    private String fdReadCount;

    private String fdTypenme;

    private String fdCreatNme;
    
    private String fdHot="0";
    
    private String dayNum;

    private String url;

    private String flag;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDayNum() {
    	if(StringUtils.isNotEmpty(fdStarttime)){
    		dayNum = DateUtil.getDayStrFormat(fdStarttime,false);
    	}
		return dayNum;
	}

	public void setDayNum(String dayNum) {
		this.dayNum = dayNum;
	}

    public String getFdHot() {
		return fdHot;
	}

	public void setFdHot(String fdHot) {
		this.fdHot = fdHot;
	}

	public String getFdCfId() {
        return fdCfId;
    }

    public void setFdCfId(String fdCfId) {
        this.fdCfId = fdCfId;
    }

    public String getFdTheme() {
        return fdTheme;
    }

    public void setFdTheme(String fdTheme) {
        this.fdTheme = fdTheme;
    }

    public String getFdContent() {
        return fdContent;
    }

    public void setFdContent(String fdContent) {
        this.fdContent = fdContent;
    }

    public String getFdCfTypeId() {
        return fdCfTypeId;
    }

    public void setFdCfTypeId(String fdCfTypeId) {
        this.fdCfTypeId = fdCfTypeId;
    }

    public String getFdReleasedep() {
        return fdReleasedep;
    }

    public void setFdReleasedep(String fdReleasedep) {
        this.fdReleasedep = fdReleasedep;
    }

    public String getFdStarttime() {
        return fdStarttime;
    }

    public void setFdStarttime(String fdStarttime) {
        this.fdStarttime = fdStarttime;
    }

    public String getFdEndtime() {
        return fdEndtime;
    }

    public void setFdEndtime(String fdEndtime) {
        this.fdEndtime = fdEndtime;
    }

    public String getFdLikecount() {
        return fdLikecount;
    }

    public void setFdLikecount(String fdLikecount) {
        this.fdLikecount = fdLikecount;
    }

    public String getFdState() {
        return fdState;
    }

    public void setFdState(String fdState) {
        this.fdState = fdState;
    }

    public String getFdTop() {
        return fdTop;
    }

    public void setFdTop(String fdTop) {
        this.fdTop = fdTop;
    }

    public String getFdCficon() {
        return fdCficon;
    }

    public void setFdCficon(String fdCficon) {
        this.fdCficon = fdCficon;
    }

    public String getFdCreaterid() {
        return fdCreaterid;
    }

    public void setFdCreaterid(String fdCreaterid) {
        this.fdCreaterid = fdCreaterid;
    }

    public String getFdDisCount() {
        return fdDisCount;
    }

    public void setFdDisCount(String fdDisCount) {
        this.fdDisCount = fdDisCount;
    }

    public String getFdReadCount() {
        return fdReadCount;
    }

    public void setFdReadCount(String fdReadCount) {
        this.fdReadCount = fdReadCount;
    }

    public String getFdTypenme() {
        return fdTypenme;
    }

    public void setFdTypenme(String fdTypenme) {
        this.fdTypenme = fdTypenme;
    }

    public String getFdCreatNme() {
        return fdCreatNme;
    }

    public void setFdCreatNme(String fdCreatNme) {
        this.fdCreatNme = fdCreatNme;
    }
}