package com.aitech.cirta.model;

import java.util.Set;

/**
 * Model de la table ville
 * 
 * @author Nassim AIT BRAHAM ( AITECH Corporate)
 *
 */

public class Ville {

	/**
	 * Attribut
	 */

	private int id;
	private String nom;
	private Set<Hotels> listHotels;

	/**
	 * Contructeur par defaut
	 */

	public Ville() {

	}

	/**
	 * Getters et Setters
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Hotels> getListHotels() {
		return listHotels;
	}

	public void setListHotels(Set<Hotels> listHotels) {
		this.listHotels = listHotels;
	}

	/**
	 * Methode descriptif du contenu de l'objet Ville
	 * 
	 * @return String
	 */

	public String toString() {

		return "Ville : [id : " + id + " , nom : " + nom + "]";
	}

}
