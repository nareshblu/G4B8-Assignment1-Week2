package com.greatlearning.assignment1;

public class HRDepartment extends SuperDepartment {
	private String departmentName = "HR Department";

	/**
	 * Method departmentName
	 * 
	 * @return String
	 */
	public String departmentName() {
		return departmentName;
	}

	/**
	 * Method getTodaysWork
	 * 
	 * @return String
	 */
	public String getTodaysWork() {
		return "Fill Today's Timesheet and mark your attendance";
	}

	/**
	 * Method getWorkDeadline
	 * 
	 * @return String
	 */
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * Method doActivity
	 * 
	 * @return
	 */
	public String doActivity() {
		return "team Lunch";
	}
}