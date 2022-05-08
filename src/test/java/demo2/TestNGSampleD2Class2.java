package demo2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSampleD2Class2 {

	@Test
	private void testC2M1() {
		System.out.println("this is d2c2m1");
		String str="d2c2 method 1 working fine";
		//assertEquals("d2c2 method 1 working fine",str);
	}
	
	@Test
	private void testC2M2() {
		System.out.println("this is d2c2m2");
		String str="d2c2 method 2 working fine";
		assertEquals("d2c2 method 2 working not fine",str);
	}
}
