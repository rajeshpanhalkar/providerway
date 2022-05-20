package AnnotationBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	@BeforeClass
	public void openbrowser() {
		System.out.println("open browser");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("close browser");
	}
	
	
	
	
	@Test
	public void m3() {
		System.out.println("m3");
}
	@Test
	public void m4() {
		System.out.println("m4");


	}
}
