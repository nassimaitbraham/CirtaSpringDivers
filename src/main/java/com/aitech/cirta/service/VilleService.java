package com.aitech.cirta.service;

import java.util.List;

import com.aitech.cirta.model.Ville;

/**
 * Interface couche service de reccuperation des villes
 * 
 * @author Nassim AIT BRAHAM ( AITECH Corporate)
 *
 */

public interface VilleService {
	
	/**
	 * Signature de la methode du service ville pour la reccuperation de la liste de toute les villes
	 * 
	 * @return List<Ville> 
	 */
	
	List<Ville> getListVilles();
	

}
