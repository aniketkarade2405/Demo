package testNG_features;

import org.testng.annotations.Test;

public class Keyword8 {

	//Question 
    //if u want to handle exception without using try catch block so how will u handle it.
	//ans - By using expectedexcetions = Arithmeticexception.class)
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void Test1() {
		
		System.out.println("Handle exception");
		int i=10/0;  //exception occur
		System.out.println("Hello");
	}
	

}
