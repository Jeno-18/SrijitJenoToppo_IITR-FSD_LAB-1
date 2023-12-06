package com.greatlearning.lab_project;
import java.util.*;

public class DriverClass 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter your First name :");
		String fn=in.next();
		System.out.println("Enter your Last name :");
		String ln=in.next();
		
		System.out.println("Please enter department from the following : "+"\n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
		int n=in.nextInt();
		
		Employee emp=new Employee(fn, ln);
		in.close();
		switch (n)
		{
			case 1:
			System.out.println("Dear "+fn+" Your generated credentials are as follows :");
			emp.showCredentials("tech");
			break; 
			
			case 2:
			System.out.println("Dear "+fn+" Your generated credentials are as follows :");
			emp.showCredentials("admin");
			break;
			
			case 3:
			System.out.println("Dear "+fn+" Your generated credentials are as follows :");
			emp.showCredentials("hr");
			break;
			
			case 4:
			System.out.println("Dear "+fn+" Your generated credentials are as follows :");
			emp.showCredentials("legal");
			break;
			
			default:
			System.out.println("you entered an invalid input");
		}
	}

}
