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
public class Intro_VisualAcuityTest {
    
   private static Intro_VisualAcuity Intro_VisualAcuity;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Intro_VisualAcuity = new Intro_VisualAcuity("Tester","0",0,0,0);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIntro_VisualAcuity() {
		
	}

	@Test
	public void testSetVisible() {
		Intro_VisualAcuity.setVisible(false);
	}
    
}
