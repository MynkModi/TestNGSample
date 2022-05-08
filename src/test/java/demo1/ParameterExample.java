package demo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class ParameterExample {
	
	@Test
	@Parameters ({"myName","zipCode"})
	private static void paramTest(String name, int zipCode) {
		System.out.println("parameter test-name & zipcode : "+name+"-"+zipCode);
		Assert.assertEquals("Adam", name);
		//assertEquals("Adam", name);
	}
	
	//********************************************************
	
	@DataProvider(name="dp1")
	private Object[] checkResult() {
		Object[] myArray= {2,4,5,8,9};
		return myArray;
	}
	
	@Test(dataProvider="dp1")
	private void testDataProvider(int num) {
		System.out.println("DataProvider test. Values are "+num);
	}
}
