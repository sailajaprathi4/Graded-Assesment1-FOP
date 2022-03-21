package com.OOPS.GradedAssessment1.FOP;

public class MainDepartment {

	public static void main(String[] args) 
	{
		adminDepartment adm=new adminDepartment();
		System.out.println("welcome to admin department");
	//adm.departmentName();
	adm.getTodaysWork();
	adm.getWorkDeadLine();
	adm.isTodayAHoliday();
	System.out.println("\n");
	
	HrDepartment hr=new HrDepartment();
	System.out.println("welcome to HR department");
	
	hr.doActivity();
	hr.getTodaysWork();
	hr.getWorkDeadLine();
	hr.isTodayAHoliday();
	System.out.println("\n");
	
	TechDepartment td=new TechDepartment();
	System.out.println("welcome to Tech department");
	
	td.getTodaysWork();
	td.getWorkDeadline();
	td.getTechStackInformation();
	td.isTodayAHoliday();
	
	}
	
}
