package demo2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSampleD2Class1 {

	@Test
	private void testC1M1() {
		System.out.println("this is d2c1m1");
		String str="d2 c1 method 1 working fine";
		assertEquals("d2 c1 method 1 working fine",str);
	}
	
	@Test
	private void testC1M2() {
		System.out.println("this is d2c1m2");
		String str="d2 c1 method 2 working fine";
		assertEquals("d2 c1 method 2 working fine",str);
	}
}
