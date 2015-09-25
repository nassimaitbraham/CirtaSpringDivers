package com.aitech.cirta.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aitech.cirta.model.Hotels;
import com.aitech.cirta.model.Role;
import com.aitech.cirta.model.User;
import com.aitech.cirta.model.Ville;
import com.aitech.cirta.service.RoleService;
import com.aitech.cirta.service.UserService;
import com.aitech.cirta.service.VilleService;

/**
 * Class principale de tests
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class Application {

	public static void main(String[] args) {

		// Chargement du context de l'application
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Obtention du bean service UserService
		UserService userService = (UserService) applicationContext.getBean("userService");

		// Test de l'injection de dependance par mutateur
		User user = userService.getUser();
		System.out.println(user);

		// Test d'injection de dependance par constructeur
		RoleService roleService = (RoleService) applicationContext.getBean("roleService");
		Role role = roleService.getRoles();
		System.out.println(role);

		// Test integration Hibernate

		VilleService villeService = (VilleService) applicationContext.getBean("villeService");
		List<Ville> listDesVille = villeService.getListVilles();

		// Affichage de la list des villes
		for (Ville ville : listDesVille) {

			System.out.println(ville);

			for (Hotels hotel : ville.getListHotels()) {
				
				System.out.println(hotel);
				
			}
		}

	}

}
