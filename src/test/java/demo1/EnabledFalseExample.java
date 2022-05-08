package demo1;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class EnabledFalseExample {

	@Test
	private void testC2M1() {
		System.out.println("this is c2m1");
		String str="c2 method 1 working fine";
		assertEquals("c2 method 1 working fine",str);
	}
	
	@Test
	private void testC2M2() {
		System.out.println("this is c2m2");
		String str="c2 method 2 working fine";
		assertEquals("c2 method 2 working not fine",str);
	}
	
	@Test(enabled=false) // this test will be ignored
	private void testC2M3() {
		System.out.println("this is c2m2..this test will be ignored");
		String str="c2 method 2 working fine";
		assertEquals("c2 method 2 working not fine",str);
	}
		
		

}
