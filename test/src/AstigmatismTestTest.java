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
public class AstigmatismTestTest {
    
private static AstigmatismTest AstigmatismTest ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		AstigmatismTest  = new AstigmatismTest("Tester","20",0,0,0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAstigmatismTest() {
	}

	@Test
	public void testSetVisible() {
		AstigmatismTest.setVisible(true);
	}
    
}
