package com.greatlearning.lab_project;

import com.greatlearning.interface_lab.CredentialService;
import java.util.*;

public class Employee implements CredentialService
{
		String firstname; 
		String Lastname;
		
		Employee(String fn, String ln)
		{
			this.firstname=fn;
			this.Lastname=ln;
		}
		
		
	@Override
	public String generatePassword() 
	{
		String pass="";
		Random random=new Random();
		
		String upper="qwertyuiopasdfghjklzxcvbnm";
		String lower="QWERTYUIOPASDFGHJKLZXCVBNM";
		String nums="1234567890";
		String schar="!@#$%^&*";
		String combined=upper+lower+nums+schar;
		for(int i=0; i<8; i++)
		{
			pass+=String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return pass;
	}

	@Override
	public String generateEmailAddress(String s) 
	{
		return firstname.toLowerCase()+Lastname.toLowerCase()+"@"+s+".greatLearning.com";
	}

	@Override
	public void showCredentials(String s2) 
	{
		System.out.println("Email ----->"+generatePassword());
		System.out.println("Password--->"+generateEmailAddress(s2));
		
	}
		
}
