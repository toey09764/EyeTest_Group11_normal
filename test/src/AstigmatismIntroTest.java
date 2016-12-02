
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
public class AstigmatismIntroTest {
    
   private static AstigmatismIntro AstigmatismIntro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		AstigmatismIntro = new AstigmatismIntro("Tester","20",0,0,0);
	}

	@Test
	public void testSetVisible() {
		AstigmatismIntro.setVisible(false);
	}
    
}
