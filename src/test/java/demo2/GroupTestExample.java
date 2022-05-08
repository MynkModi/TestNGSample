package demo2;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class GroupTestExample {
	
	@Test(groups= {"grp1Regression", "grp2Sanity"})
	private void testGrpTest1() {
		System.out.println("this is testGrpTest1");
		String str="testGrpTest1 working fine";
		assertEquals("testGrpTest1 working fine",str);
	}
	
	@Test(groups= {"grp3Smoke"})
	private void testGrpTest2() {
		System.out.println("this is testGrpTest2");
		String str="testGrpTest2 working fine";
		assertEquals("testGrpTest2 working fine",str);
	}
	
	
	@Test(groups= {"grp2Sanity"})
	private void testGrpTest3() {
		System.out.println("this is testGrpTest3");
		String str="testGrpTest3 working fine";
		assertEquals("testGrpTest3 working fine",str);
	}
}
