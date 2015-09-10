package com.aitech.cirta.service;

import com.aitech.cirta.dao.RoleDao;
import com.aitech.cirta.model.Role;

/**
 * Implementation du service Role
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class RoleServiceImpl implements RoleService {

	/**
	 * Instantiation de l'objet RoleDao grace a l injection de dependance
	 */

	private RoleDao roleDao;

	/**
	 * Construccteur
	 * 
	 * @param roleDao
	 */

	public RoleServiceImpl(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	/**
	 * Implementation de la methode getRoles
	 */
	public Role getRoles() {

		return roleDao.getRoles();
	}

}
