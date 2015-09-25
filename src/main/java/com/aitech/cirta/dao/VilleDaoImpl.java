package com.aitech.cirta.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.aitech.cirta.model.Ville;

/**
 * Implementation de l'interface VilleDao
 * 
 * @author Nassim AIT BRAHAM ( AITECH Corporate)
 *
 */

public class VilleDaoImpl implements VilleDao {

	/**
	 * 
	 * Attribut
	 * 
	 */

	private SessionFactory sessionFactory;

	/**
	 * 
	 * Contructeur par defaut
	 */

	public VilleDaoImpl() {

	}

	/**
	 * Injection par setter du sessionFactory
	 * 
	 * @param sessionFactory
	 */

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Implementation de la methode pour reccuperer la liste des villes
	 * 
	 * @return List<Ville>
	 */

	public List<Ville> getListVille() {

		return (List<Ville>) this.sessionFactory.getCurrentSession().createQuery("from Ville").list();
	}

}
