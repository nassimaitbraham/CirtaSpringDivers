package com.aitech.cirta.model;

public class User {

	/**
	 * Attributs
	 */
	private String prenom;
	private String nom;

	/**
	 * Getters et Setters
	 */

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 *  Methode qui retourne l'etat de l'objet user
	 * 
	 */
	public String toString(){
		return "bean User  = [nom : " + nom + " , Prenom :"+prenom + "]";
	}

}
