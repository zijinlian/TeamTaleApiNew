package com.work.entity;

import java.math.BigDecimal;

public class TDishMenu {
    private String dishid;

    private String classid;

    private String dishsn;

    private String dishname;

    private String ingredient;

    private String description;

    private BigDecimal unitprice;

    private String chef;

    private String image;
    
    private String className;
    
    private String praiseCount;
    
    private String commentCount;
    
    private String score;
    
    private boolean isPraise;
    
    private boolean isTake;
    
    private String takeId;
    
    private String dishareaname;
    
    
	public String getDishareaname() {
		return dishareaname;
	}

	public void setDishareaname(String dishareaname) {
		this.dishareaname = dishareaname;
	}

	public String getTakeId() {
		return takeId;
	}

	public void setTakeId(String takeId) {
		this.takeId = takeId;
	}

	public boolean isTake() {
		return isTake;
	}

	public void setTake(boolean isTake) {
		this.isTake = isTake;
	}

	public boolean isPraise() {
		return isPraise;
	}

	public void setPraise(boolean isPraise) {
		this.isPraise = isPraise;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPraiseCount() {
		return praiseCount;
	}

	public void setPraiseCount(String praiseCount) {
		this.praiseCount = praiseCount;
	}

	public String getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}

	public String getDishid() {
        return dishid;
    }

    public void setDishid(String dishid) {
        this.dishid = dishid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getDishsn() {
        return dishsn;
    }

    public void setDishsn(String dishsn) {
        this.dishsn = dishsn;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}