package com.greatlearning.assignment1;

public class Driver {

	public static void main(String[] args) {
		/*
		 * Create objects for all the subclasses.
		 */
		AdminDepartment admin = new AdminDepartment();
		HRDepartment hr = new HRDepartment();
		TechDepartment tech = new TechDepartment();

//		Call all the methods in Admin Department
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());

//		Calling a method in Super class
		System.out.println(admin.isTodayAHoliday());

//		Call all the methods in HR Department
		System.out.println();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());

//		Calling a method in Super class
		System.out.println(hr.isTodayAHoliday());

//		Call all the methods in Tech Department
		System.out.println();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());

//		Calling a method in Super class
		System.out.println(tech.isTodayAHoliday());

	}

}
