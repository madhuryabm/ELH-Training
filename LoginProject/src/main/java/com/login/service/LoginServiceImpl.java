package com.login.service;

import com.login.dao.LoginDao;
import com.login.dao.LoginDaoImpl;
import com.login.model.User;

public class LoginServiceImpl implements LoginService {

	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User readByUserIdAndPassword(User user) {
		// TODO Auto-generated method stub
		User userdummy = null;
		if(user != null) {
			LoginDao loginDao=new LoginDaoImpl();
			userdummy=loginDao.readByUserIdAndPassword(user);
			
		}
		return userdummy;
	}

	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User delete(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
