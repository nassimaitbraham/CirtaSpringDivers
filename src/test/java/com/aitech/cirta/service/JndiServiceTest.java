package com.aitech.cirta.service;

import static org.junit.Assert.assertEquals;

import javax.naming.NamingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test unitaire du service JNDI
 * 
 * @author nasnet
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class JndiServiceTest {

	@Autowired
	private LdapJndiServiceImpl ldapJndiService;

	/**
	 * Methode de test avec une condition verifier
	 */

	@Test
	public void getUserPersonnelInformationTestOk() {

		try {
			assertEquals("nassimus", ldapJndiService.getUserPersonnelInformation("nasnet").getPrenom());
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void getUserPersonnelInformationTestNok() {

		try {
			assertEquals("lyesnet", ldapJndiService.getUserPersonnelInformation("nasnet").getPrenom());
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
