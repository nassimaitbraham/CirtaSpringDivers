package com.aitech.cirta.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.aitech.cirta.dao.VilleDao;
import com.aitech.cirta.model.Ville;

/**
 * Implementation de la couche service de reccuperation des villes
 * 
 * @author Nassim AIT BRAHAM ( AITECH Corporate)
 *
 */


public class VilleServiceImpl implements VilleService {

	/**
	 * Attribut
	 */

	private VilleDao villeDao;

	/**
	 * Constructeur
	 * 
	 * @param villeDao
	 */
	
	VilleServiceImpl(VilleDao villeDao) {
		this.villeDao = villeDao;
	}

	/**
	 * Implementation de la methode du service ville pour la reccuperation de la
	 * liste de toute les villes
	 * 
	 * @return List<Ville>
	 */

	@Transactional(readOnly=true)
	public List<Ville> getListVilles() {

		return villeDao.getListVille();
	}

}
