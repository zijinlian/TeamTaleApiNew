package com.work.entity;


public class TbIccProblemDept {

	//试题所属部门ID
	private String FdProblemDeptId;

	//试题所属部门名称
	private String FdProblemDeptName;



    public String getFdProblemDeptId() {
        return FdProblemDeptId;
    }

    public void setFdProblemDeptId(String fdProblemDeptId) {
        FdProblemDeptId = fdProblemDeptId;
    }

    public String getFdProblemDeptName() {
        return FdProblemDeptName;
    }

    public void setFdProblemDeptName(String fdProblemDeptName) {
        FdProblemDeptName = fdProblemDeptName;
    }
}
