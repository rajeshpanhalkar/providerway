package AnnotationBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
public void openDB() {
	System.out.println("open database");
}
	@AfterTest
	public void closeDB() {
		System.out.println("close database");}
	@BeforeClass
	public void openbrowser() {
		System.out.println("open browser");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("close browser");
	}
		@Test
		public void m1() {
			System.out.println("m1");
			
	}
		@Test
		public void m2() {
			System.out.println("m2");
}
}