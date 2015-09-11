package com.aitech.cirta.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testGetUser() {

		assertEquals("ait braham", userService.getUser().getNom());
	    //assertEquals("xxx", userService.getUser().getNom());

	}

}
