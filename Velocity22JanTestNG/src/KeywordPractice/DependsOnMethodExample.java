package KeywordPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
	   
	@Test(priority=1)
		public void openurl(){
			System.out.println("open url");
			Assert.fail();
		
		}
	     @Test(priority=2 , dependsOnMethods="openurl")
		public void login(){
			System.out.println("log in");
		}
	     @Test(priority=3)
		public void logout(){
			System.out.println("log out");
		}
}

