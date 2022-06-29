package com.greatlearning.childclasses ;

import com.greatlearning.parentclass.SuperDepartment ;

public class TechnicalDepartment extends SuperDepartment
{

	public String departmentName()
	{
		return " Welcome to Technical Department " ;
		
	}
	
	public String getTodaysWork()
	{
		return " Complete coding of Module 1 " ;
	}
	
	public String getWorkDeadline()
	{
		return " Complete by EOD " ;
	}
	
	public String getTechStackInformation()
	{
		return " Core Java " ;
	}
	
}
