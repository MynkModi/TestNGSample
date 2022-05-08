package demo3;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DependencyExample {
	
	private static int doSum(int a, int b) {
		return a+b; 
	}
	
	@Test(groups= {"depend1"})
	private int checkResult() {
		System.out.println("dependency1");
		assertEquals(doSum(1,8),9);
		return doSum(1,8);

	}
	
	//@Test(dependsOnMethods= {"checkResult"})
	@Test(groups= {"depend2"})
	private void checkTotalResult() {
		System.out.println("dependency2");
		assertEquals(checkResult(),9);
	}
}
