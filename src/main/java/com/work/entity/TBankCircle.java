package com.work.entity;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.work.common.DateUtil;

public class TBankCircle {
    private String id;

    private String empId;

    private String content;

    private String commCount;

    private String pariseCount;

    private String createTime;

    private String orgOrDeptCode;

    private String isHot;

    private String isPublic;
    
    private String pariseTime;
    
    private boolean isZ;
    
    private String dayNum;
    
    private String headIcon;
    
    private String empName;
    
    private List<TBankCircleImg> imgs;
    
    private List<TBankCircleComment> comments;
    
    private List<TBankCircleParise> parises;
    
    
    public List<TBankCircleParise> getParises() {
		return parises;
	}

	public void setParises(List<TBankCircleParise> parises) {
		this.parises = parises;
	}

	public String getDayNum() {
    	if(StringUtils.isNotEmpty(createTime)){
    		dayNum = DateUtil.getDayStrFormat(createTime,true);
    	}
		return dayNum;
	}

	public void setDayNum(String dayNum) {
		this.dayNum = dayNum;
	}
	
	
    public boolean getIsZ() {
		return isZ;
	}

	public void setIsZ(boolean isZ) {
		this.isZ = isZ;
	}

	public List<TBankCircleComment> getComments() {
		return comments;
	}

	public void setComments(List<TBankCircleComment> comments) {
		this.comments = comments;
	}

	public String getHeadIcon() {
		return headIcon;
	}

	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
    
    public List<TBankCircleImg> getImgs() {
		return imgs;
	}

	public void setImgs(List<TBankCircleImg> imgs) {
		this.imgs = imgs;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommCount() {
        return commCount;
    }

    public void setCommCount(String commCount) {
        this.commCount = commCount;
    }

    public String getPariseCount() {
        return pariseCount;
    }

    public void setPariseCount(String pariseCount) {
        this.pariseCount = pariseCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOrgOrDeptCode() {
        return orgOrDeptCode;
    }

    public void setOrgOrDeptCode(String orgOrDeptCode) {
        this.orgOrDeptCode = orgOrDeptCode;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }
    
    public String getPariseTime() {
        return pariseTime;
    }

    public void setPariseTime(String pariseTime) {
        this.pariseTime = pariseTime;
    }
}