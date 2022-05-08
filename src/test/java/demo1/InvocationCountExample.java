package demo1;

import org.testng.annotations.Test;

public class InvocationCountExample {
	@Test(invocationCount=2)
	private static void msgPrint() {
		System.out.println("test for invocation count");
	}
}
