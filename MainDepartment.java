package com.oops.GradedAssesment1;
class superDepartment
{
	public String departmentName()
	{
		System.out.println("super deperatment");
		return "";
	}
	public String getTodaysWork() 
	{
		System.out.println("No work as of now");
		return "";
	}
	public String getWorkDeadLine()
	{
		System.out.println("nill");
		return "";
	}
	public String isTodayAHoliday()
	{
		System.out.println("Today is not a holiday");
		return "";
	}
	
}
class adminDepartment extends superDepartment
{
	public String departmentName()
	{
		System.out.println("Admin deperatment");
		return "";
	}
	public String getTodaysWork()
	{
		System.out.println("complete your document submission");
		return "";
	}
	public String getWorkDeadLine()
	{
		System.out.println("Complete by EOD");
		return "";
	}
}
class HrDepartment extends superDepartment
{
	public String departmentName()
	{
		System.out.println("HR Department");
		return "";
	}
	public String getTodaysWork()
	{
		System.out.println("fill todays worksheet and mark your attendence");
		return "";
	}
	public String getWorkDeadLine()
	{
		System.out.println("Complete by EOD");
		return "";
	}
	public String doActivity()
	{
		System.out.println("Team Lunch");
		return "";
	}
}
class TechDepartment extends superDepartment
{
	public String departmentName()
	{
		System.out.println("Tech Department");
		return "";
	}
	public String getTodaysWork()
	{	System.out.println("complete coding of module 1");
		return "";
	}
	public String getWorkDeadline()
	{	
		System.out.println("Complete by EOD");
		return "";
	}
	public String getTechStackInformation()
	{
		System.out.println("core java");
		return "";
	}
}
class MainDepartment {

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
