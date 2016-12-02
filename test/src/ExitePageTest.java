/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.event.ActionEvent;
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
public class ExitePageTest {
    
   private static ExitePage ExitePage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ExitePage = new ExitePage("Tester");
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
	public void testExitePage() {
	
	}

	@Test
	public void testCloseFrame() {
		ExitePage.closeFrame();
	}

	@Test
	public void testActionPerformed() {
		ExitePageTest.ExitePage.hashCode();
	}

	@Test
	public void testSetVisible() {
		ExitePage.setVisible(false);
	}

    
}
