package demo4;

import org.junit.Test;
import static org.testng.AssertJUnit.*;

public class JunitToTestNGExample {
	@Test
	   public void testJunittoTestNg() {
	      String str = "Junit test run with TestNG";
	      System.out.println("this is Junit via TestNG method");
	      assertEquals("Junit test run with TestNG",str);
	   }
}


