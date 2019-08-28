package com.work.entity;

public class TDishMeal {
    private String mealid;

    private String disharea;

    private String dishstartime;

    private String dishendtime;

    private String checkstarttime;

    private String checkendtime;
    
    private String num;

    public String getMealid() {
        return mealid;
    }

    public void setMealid(String mealid) {
        this.mealid = mealid;
    }

    public String getDisharea() {
        return disharea;
    }

    public void setDisharea(String disharea) {
        this.disharea = disharea;
    }

    public String getDishstartime() {
        return dishstartime;
    }

    public void setDishstartime(String dishstartime) {
        this.dishstartime = dishstartime;
    }

    public String getDishendtime() {
        return dishendtime;
    }

    public void setDishendtime(String dishendtime) {
        this.dishendtime = dishendtime;
    }

    public String getCheckstarttime() {
        return checkstarttime;
    }

    public void setCheckstarttime(String checkstarttime) {
        this.checkstarttime = checkstarttime;
    }

    public String getCheckendtime() {
        return checkendtime;
    }

    public void setCheckendtime(String checkendtime) {
        this.checkendtime = checkendtime;
    }

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}