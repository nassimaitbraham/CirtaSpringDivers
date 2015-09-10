package com.aitech.cirta.dao;

import com.aitech.cirta.model.Role;

/**
 * Implementation de la RoleDao
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class RoleDaoImpl implements RoleDao {

	/**
	 * Instantiation de l'objet Role grace a l injection de dependance
	 */

	private Role role;

	/**
	 * Constructeur
	 * 
	 * @param role
	 */
	
	public RoleDaoImpl(Role role) {
		this.role = role;
	}

	/**
	 * Implementation de la methode getRoles
	 */

	public Role getRoles() {

		return role;
	}
}
