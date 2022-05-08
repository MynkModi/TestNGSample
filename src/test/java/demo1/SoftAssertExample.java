package demo1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
	SoftAssert soft_assert=new SoftAssert();
			
			
	/*	@Test
		private void testHardAssert() {
			Assert.assertTrue(false);
		}*/
	
	@Test
	private void testSoftAssert() {
		soft_assert.assertTrue(false);
		System.out.println("test for soft assert");
	}
	
}
