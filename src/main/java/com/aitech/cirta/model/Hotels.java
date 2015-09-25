package com.aitech.cirta.model;

import java.util.Set;

/**
 * Model de la table hotels
 * 
 * @author Nassim AIT BRAHAM ( AITECH Corporate)
 *
 */

public class Hotels {

	/**
	 * Attribut
	 */

	private int id;
	private int id_ville;
	private String categorie;
	private String adresse;
	private int telephone;
	private Ville ville;
    
	/**
	 * Contructeur par defaut
	 */

	public Hotels() {
	}

	/**
	 * Getters and Setters
	 * 
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_ville() {
		return id_ville;
	}

	public void setId_ville(int id_ville) {
		this.id_ville = id_ville;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	/**
	 * Methode descriptif du contenu de l'objet Hotel
	 * 
	 * @return String
	 */
	
	public String toString(){
		return "Hotel : [id : "+id+" , nom : " + categorie + " , adresse : " +adresse + " ]";
	}

	
	
}
