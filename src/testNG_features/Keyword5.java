package testNG_features;

import org.testng.annotations.Test;

public class Keyword5 {
	
	@Test(invocationCount = 10)
	public void m2() {
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println("Sum is == :"+c);
	}


}
