package com.aitech.cirta.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aitech.cirta.model.Role;
import com.aitech.cirta.model.User;
import com.aitech.cirta.service.RoleService;
import com.aitech.cirta.service.UserService;

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
		UserService userService = (UserService)applicationContext.getBean("userService");		
		
		//Test de l'injection de dependance par mutateur
		User user = userService.getUser();
		System.out.println(user);
		
		//Test d'injection de dependance par constructeur
		RoleService roleService = (RoleService)applicationContext.getBean("roleService");
		Role role = roleService.getRoles();
		System.out.println(role);
		
		
	}

}
