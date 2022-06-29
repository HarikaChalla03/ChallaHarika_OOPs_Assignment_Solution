package com.greatlearning.childclasses ;

import com.greatlearning.parentclass.SuperDepartment ;

public class AdminDepartment extends SuperDepartment 
{

	public String departmentName()
	{
		return " Welcome to Admin Department " ;
	}
	
	public String getTodaysWork()
	{
		return " Complete your Documents Submission " ;
	}
	
	public String getWorkDeadline()
	{
		return " Complete by EOD " ;
	}
	
}
