package demo1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class BeforeAfterExample {

	@Test
	private void testC1M1() {
		System.out.println("this is c1m1");
		String str="c1 method 1 working fine";
		assertEquals("c1 method 1 working fine",str);
	}
	
	@Test
	private void testC1M2() {
		System.out.println("this is c1m2");
		String str="c1 method 2 working fine";
		assertEquals("c1 method 2 working fine",str);
	}
	
	/*@BeforeMethod
	public void beforeMethod() {
	    System.out.println("in beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
	    System.out.println("in afterMethod");
	}
	
	@BeforeClass
	public void beforeClass() {
	   System.out.println("in beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
	   System.out.println("in afterClass");
	}
	
	@BeforeTest
	public void beforeTest() {
	   System.out.println("in beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
	   System.out.println("in afterTest");
	}
	
	@BeforeSuite
	public void beforeSuite() {
	   System.out.println("in beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
	   System.out.println("in afterSuite");
	}*/
}
