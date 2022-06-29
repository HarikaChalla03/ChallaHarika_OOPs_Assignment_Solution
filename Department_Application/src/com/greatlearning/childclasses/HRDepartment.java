package com.greatlearning.childclasses ;

import com.greatlearning.parentclass.SuperDepartment ;

public class HRDepartment extends SuperDepartment
{
	
	public String departmentName()
	{
		return " Welcome to HR Department " ;
	}
	
	public String getTodaysWork()
	{
		return " Fill today's Timesheet and mark your Attendance " ;
	}
 
	public String getWorkDeadline()
	{
		return " Complete by EOD " ;
	}
	
	public String doActivity() 
	{
		return " team Lunch " ;
	}
	
}
