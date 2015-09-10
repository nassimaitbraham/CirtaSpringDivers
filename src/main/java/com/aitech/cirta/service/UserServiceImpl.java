package com.aitech.cirta.service;

import com.aitech.cirta.dao.UserDao;
import com.aitech.cirta.model.User;

/**
 * Implementation du service user
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	/**
    *
    * Implementation de la methode getUser
    */
	public User getUser() {
		return userDao.getUsers();
	}
	
	

}
