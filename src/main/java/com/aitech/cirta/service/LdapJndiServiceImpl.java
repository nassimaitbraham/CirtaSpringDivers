package com.aitech.cirta.service;

import java.util.Hashtable;

import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import com.aitech.cirta.model.User;

/**
 * Implementation du service de connection au service d'annuaire (JNDI)
 * 
 * @author Nassim AIT BRAHAM
 *
 */

public class LdapJndiServiceImpl implements LdapJndiService {

	/**
	 * Logger
	 */

	private static final Logger logger = Logger.getLogger(LdapJndiServiceImpl.class);

	/**
	 * Attribut
	 */

	private User user;

	/**
	 * Constructeur
	 * 
	 * @param user
	 */
	public LdapJndiServiceImpl(User user) {
		this.user = user;
	}

	/**
	 * Injection des valeurs avec le placeHolder dans le fichier
	 * applicationContext.xml
	 */
	@Value("${ldap.url}")
	private String url;
	@Value("${ldap.context.factory}")
	private String ldapContextFactory;
	@Value("${ldap.type.authentification}")
	private String typeAnthentification;
	@Value("${ldap.utilisateur.dn}")
	private String utilisateurDn;
	@Value("${ldap.mots.pass}")
	private String motsPass;
	@Value("${ldap.base.recherche.personnel}")
	private String baseRecherchePersonnel;

	/**
	 * Implementation de la methode d'obtention d'un directory context
	 */

	public DirContext getDirContext() {

		Hashtable<String, String> env = new Hashtable<String, String>();

		env.put(Context.INITIAL_CONTEXT_FACTORY, ldapContextFactory);
		env.put(Context.PROVIDER_URL, url);
		env.put(Context.SECURITY_AUTHENTICATION, typeAnthentification);
		env.put(Context.SECURITY_PRINCIPAL, utilisateurDn);
		env.put(Context.SECURITY_CREDENTIALS, motsPass);

		DirContext ctx = null;

		try {
			ctx = new InitialDirContext(env);
		} catch (AuthenticationNotSupportedException ex) {

			logger.error("Authentification non supporter : ", ex);

		} catch (AuthenticationException ex) {

			logger.error("Login/password n'est pas bon : ", ex);
		
		} catch (NamingException ex) {
		
			logger.error("NamingException : ", ex);
		
		}

		return ctx;

	}

	/**
	 * Implementation de la methode pour reccuperer un user dans le LDAP
	 * 
	 * @param uid
	 * @return User
	 * @throws NamingException
	 */

	public User getUserPersonnelInformation(String uid) throws NamingException {

		SearchControls sc = new SearchControls();
		sc.setSearchScope(SearchControls.SUBTREE_SCOPE);

		NamingEnumeration<?> results = getDirContext().search(baseRecherchePersonnel, "(uid=" + uid + ")", sc);

		while (results.hasMore()) {
			SearchResult sr = (SearchResult) results.next();
			Attributes attrs = sr.getAttributes();

			// Renseigner le model user

			user.setNom((String) attrs.get("givenName").get());
			user.setPrenom((String) attrs.get("sn").get());
		}

		// Fermeture du context
		getDirContext().close();
		return user;

	}

}
