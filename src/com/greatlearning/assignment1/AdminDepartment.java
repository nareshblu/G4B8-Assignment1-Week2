//#by Chandan Jyoti Sarma Admin Module  13/06/2023

package com.greatlearning.assignment1;
import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AdminDepartment{

	public String departmentName() {
		String deptName="Wellcome to Admin Department";
		System.out.println(deptName);
		return null;
	}
	public String getsTodaysWork() {
		String todayWork="Complete your document submission";
		System.out.println(todayWork);
		return null;
	}
	public String getWorkDeadline() {
		String workDeadline="Complete by EOD";
		System.out.println(workDeadline);
		return null;
	}
	public String getHoliday() {
		String workDay="";
		int workFlag;
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-YYYY");
		System.out.println("Todays Working Date  :"+sdf.format(calendar.getTime()));
		Format f_workDay = new SimpleDateFormat("EEEE");
		workDay = f_workDay.format(new Date());
		workFlag= calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("Today's Working Day  :"+workDay);
		if (workFlag==1)
		{
			System.out.println("This is Holiday");
		}
		else
		{	
			System.out.println("This is not Holiday");

		}
		return workDay;

	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		AdminDepartment admdept = new AdminDepartment();
		admdept.departmentName();
		admdept.getsTodaysWork();
		admdept.getWorkDeadline();
		admdept.getHoliday();
	}

}
