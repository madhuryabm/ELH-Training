package com.login.dao;

import com.login.model.User;

public class LoginDaoImpl implements LoginDao {

	public User create(User user) {
		// TODO Auto-generated method stub
		User freshuser=new User();
		freshuser.setPassword(user.getPassword());
		freshuser.setUserID(user.getUserID());
		freshuser.setUserName(user.getUserName());
		return freshuser;
	}

	public User readByUserIdAndPassword(User user) {
	
		if (user.getUserID() == 123456 && user.getPassword().equals("Secret"))
		{
			user.setUserName("Hello");

		}
		if (user.getUserID() == 123457 && user.getPassword().equals("happy") ) {
			user.setUserName("World");
		}
		return user;
	}

	public User update(User user) {
		// TODO Auto-generated method stub
		if(user.getUserID()==123456 && user.getPassword().equals("Secret"))
		{
			String updatedName=user.getUserName();
			user.setUserName(updatedName);
			String updatedPassword=user.getPassword();
			user.setPassword(updatedPassword);
			
		}
		return user;
		
	}

	public User delete(int userId) {
		// TODO Auto-generated method stub
		User user=null;
		if(userId==123456) {
			user.setPassword(null);
			user.setUserID(0);
			user.setUserName(null);
			System.out.println("user deleted successfully");
		if(userId==123457) {
			user.setPassword(null);
			user.setUserID(0);
			user.setUserName(null);
			System.out.println("user deleted successfully");
			
		}
			
		}
		return user;
	

}}
