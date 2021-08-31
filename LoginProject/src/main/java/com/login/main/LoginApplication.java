package com.login.main;

import java.util.Scanner;

import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.LoginServiceImpl;

public class LoginApplication {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("EnteruserId :");
		int id = input.nextInt();
		
		System.out.println("Enter password :");
		String password = input.next();
		User user=new User();	
		LoginService loginService=new LoginServiceImpl();
	
		user.setPassword(password);
 	    user.setUserID(id);
		User ans = loginService.readByUserIdAndPassword(user);
		if(ans!=null) {
			System.out.println("welcome "+ ans.getUserName());
		}
			else
			{
				System.out.println("happiness");
			}
		

	}}


