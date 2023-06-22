package testNG_features;

import org.testng.annotations.Test;

public class Keyword7 {
	
	
	@Test(timeOut = 3000)
	public void loop() {		
		for(;;) {
			System.out.println("Hello");
			break;
		}
		
	}


}
