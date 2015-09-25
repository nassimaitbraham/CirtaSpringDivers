package com.aitech.cirta.dao;

import java.util.List;

import com.aitech.cirta.model.Ville;

/**
 * Interface couche Dao de reccuperation des villes
 * 
 * @author Nassim AIT BRAHAM ( AITECH Corporate)
 *
 */

public interface VilleDao {
	
	
	/**
	 * Methode pour reccuperer la liste de toute les villes
	 * 
	 * @return List<Ville>
	 */
	
	List<Ville> getListVille();
	

}
