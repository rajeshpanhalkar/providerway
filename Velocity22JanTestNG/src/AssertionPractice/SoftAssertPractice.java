package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {

SoftAssert soft=new SoftAssert();
@Test
public void sample1() {
	Assert.assertEquals("R","S");
	Assert.assertNotEquals("R", "S");
}
@Test
public void sample2() {
	soft.assertEquals("R","S");
	soft.assertNotEquals("R","S");
}
}
