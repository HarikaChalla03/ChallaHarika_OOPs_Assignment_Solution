package com.greatlearning.driverclass ;

import com.greatlearning.childclasses.AdminDepartment ;

import com.greatlearning.childclasses.HRDepartment ;

import com.greatlearning.childclasses.TechnicalDepartment ;

public class Main 
{

	public static void main( String [] args )
	{
		
		AdminDepartment  admin_department  =  new  AdminDepartment() ;    // Instantiating the child class of AdminDepartment
		
		    System.out.println( admin_department.departmentName() ) ;
		    System.out.println( admin_department.getTodaysWork() ) ;
	        System.out.println( admin_department.getWorkDeadline() ) ;
		    System.out.println( admin_department.isTodayAHoliday() + "\n\n" ) ;  // Accessing parent class(SuperDeparment) properties/methods via object
		  
		HRDepartment  hr_department  =  new  HRDepartment() ;     //  Instantiating the child class of HRDepartment
	        
		     System.out.println( hr_department.departmentName() ) ;
		     System.out.println( hr_department.doActivity() ) ; 
		     System.out.println( hr_department.getTodaysWork() ) ;
		     System.out.println( hr_department.getWorkDeadline() ) ;
		     System.out.println( hr_department.isTodayAHoliday() + "\n\n" ) ; // Accessing parent class(SuperDeparment) properties/methods via object 
		     
		 TechnicalDepartment  tech_department  =  new  TechnicalDepartment() ;  //  Instantiating the child class of TechnicalDepartment
		 
		     System.out.println( tech_department.departmentName() ) ;  
 		     System.out.println( tech_department.getTodaysWork() ) ;
		     System.out.println( tech_department.getWorkDeadline() ) ;
		     System.out.println( tech_department.getTechStackInformation() ) ;
		     System.out.println( tech_department.isTodayAHoliday() ) ;  // Accessing parent class(SuperDeparment) properties/methods via object
		     
	}
	
}

