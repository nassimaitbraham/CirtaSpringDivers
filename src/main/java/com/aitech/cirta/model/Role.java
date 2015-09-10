package com.aitech.cirta.model;

public class Role {

	/**
	 * Attribut
	 * 
	 */

	private String type;

	/**
	 * Constructeur
	 * 
	 * @param type
	 */

	Role(String type) {
		this.type = type;
	}

	/**
	 * Getters et Setters
	 */

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Methode toSting pour afficher l'etat de l'objet
	 */
	public String toString() {
		return "Type du role : " + type;
	}
}
