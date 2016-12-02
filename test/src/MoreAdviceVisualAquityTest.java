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
public class MoreAdviceVisualAquityTest {
    
   private static MoreAdviceVisualAquity MoreAdviceVisualAquity;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		MoreAdviceVisualAquity = new MoreAdviceVisualAquity("Tester", "20", 0,0,0);
	}
	@Test
	public void testMoreAdviceVisualAquity() {
		
	}

	@Test
	public void testSetVisible() {
		MoreAdviceVisualAquity.setVisible(false);
	}
}
