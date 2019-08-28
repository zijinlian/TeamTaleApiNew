package com.work.entity;

public class TTaskSuperviseDuty {
    private String id;

    private String taskId;

    private String fdObjectId;

    private String fdTaskFlay;

    private String fdTaskType;

    private String fdTaskDept;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getFdObjectId() {
        return fdObjectId;
    }

    public void setFdObjectId(String fdObjectId) {
        this.fdObjectId = fdObjectId;
    }

    public String getFdTaskFlay() {
        return fdTaskFlay;
    }

    public void setFdTaskFlay(String fdTaskFlay) {
        this.fdTaskFlay = fdTaskFlay;
    }

    public String getFdTaskType() {
        return fdTaskType;
    }

    public void setFdTaskType(String fdTaskType) {
        this.fdTaskType = fdTaskType;
    }

    public String getFdTaskDept() {
        return fdTaskDept;
    }

    public void setFdTaskDept(String fdTaskDept) {
        this.fdTaskDept = fdTaskDept;
    }
}