package com.greatlearning.assignment1;


public class HRDepartment extends SuperDepartment {
	private String departmentName = "HR Department";

	public String departmentName() {
		return departmentName;
	}
	
	public String getTodaysWork()
	{
		return "Fill Today's Timesheet and mark your attendance";
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
	public String doActivity(){
		return "team Lunch";
	}
}