package MethodExample;

public class MethodSameClass {
	//2 static method
	//2 non static method
	//main method and call it
	//static method
	public static void m1() {
		System.out.println("this is static method m1");
	}
	public static void m2() {
		System.out.println("this is static method m2");
	}
	//non static method
	public void m3() {
		System.out.println("this is non static method m3");
	}
	public void m4() {
		System.out.println("this is non static method m4");
	}
	public static void main(String[]args) {
		MethodSameClass.m1();
		MethodSameClass.m2();
		MethodSameClass f1=new MethodSameClass();
		f1.m3();
		f1.m4();
				
	}
}
