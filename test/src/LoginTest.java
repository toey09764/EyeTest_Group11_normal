/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toey35623
 */
public class LoginTest {
    
   private Login Login;
	
	@Test
	public void testLogin() {
		
	}

	@Test
	public void testGetName() {
		new Login().getName();
	}

	@Test
	public void testGetAge() {
		new Login().getAge();
	}

	@Test
	public void testMain() {
		Login = new Login();
	}

	@Test
	public void testSetVisible() {
		new Login().setVisible(false);
	}
}
