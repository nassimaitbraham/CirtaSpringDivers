package com.aitech.cirta.service;

import javax.naming.NamingException;
import javax.naming.directory.DirContext;

import com.aitech.cirta.model.User;

/**
 * Service d'utilisation d'un annuaire LDAP
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public interface LdapJndiService {

	/**
	 * Implementation de la methode d'obtention d'un directory context
	 */
	
	DirContext getDirContext();

	/**
	 * Signature de la methode qui permet de reccuperer les informations d'un
	 * user a partir de son uid dans le LDAP
	 * 
	 * @param uid
	 * @return User
	 * @throws NamingException
	 */
	
	User getUserPersonnelInformation(String uid) throws NamingException;

}
