package com.aitech.cirta.dao;

import com.aitech.cirta.model.User;

/**
 * Implementation de l'interface UserDao
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class UserDaoImpl implements UserDao {

	/**
	 * Intanciation de l'objet grace a l'injection de dependance
	 */

	private User user;

	/**
	 * Declaration du setter pour l'injection de dependance par mutateur
	 * 
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Implementation de la methode getUsers
	 */
	public User getUsers() {

		return user;
	}

}
