package demo1;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ExpectedExceptionExample {
	private static int doCalculation(int a, int b) {
		return a/b; 
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	private void checkResult() {
		System.out.println("this is ExpectedExceptionExample");
		doCalculation(0,5);
	}
}
