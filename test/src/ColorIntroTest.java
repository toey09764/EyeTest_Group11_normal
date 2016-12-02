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
public class ColorIntroTest {
    
    private static ColorIntro ColorIntro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ColorIntro = new ColorIntro("Tester","20",0,0,0);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testColorIntro() {
		
	}

	@Test
	public void testSetVisible() {
		ColorIntro.setVisible(true);
	}
    
}
