package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	String str1 ="Hello";
	String str2 ="Hi";
	@Test
	public void sample() {
	Assert.assertEquals(str1, str2);   // ouutput==> Fail
	}
	//String str1 ="Hello";
	//String str2 ="Hi";
	@Test
	public void sample1() {
	Assert.assertNotEquals(str1, str2);  // Pass
	}
	
////3. assertTrue():- This method is used to verify conditions are true or false.If condition is true then output is pass otherwise fail.
//	@Test
//	public void sample3() {
//	Assert.assertTrue(rv.isSelected());  
//	Assert.assertTrue(rv.isDisplayed());  
//	Assert.assertTrue(rv.isEnabled());  
	//}
//4. assertFalse():- It is used to verify the conditions are true or false. If condition is true then output is fail and if condition is false then output is pass.
//5. assertNull():- This method is used to verify components or textfields are empty or not.If it is empty output is pass otherwise fail.
	//String str1 ="Hello";
	//String str2 ="Hi";
	@Test
	public void sample4() {
	Assert.assertNull(str1);
	}
//6. assertNotNull():-  This method is used to verify component or text field is empty or not. If it is not empty then output is pass otherwise fail.
	//String str1 ="Hello";
	//String str2 ="Hi";
	@Test
	public void sample5() {
	Assert.assertNotNull(str2);
	}
//7. fail():- This method is used to intensionally fail the test method.
	//String str1 ="Hello";
	//String str2 ="Hi";
	@Test
	public void sample6() {
	System.out.println(str2);
	Assert.fail();
	}
	
}
