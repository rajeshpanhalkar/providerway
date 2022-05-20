package MethodExample;

public class StaticExample {
static int a=10;
int b=20;
public static void m1() {
	System.out.println("This is static method m1");
	System.out.println(a);
}
public void m2() {
	System.out.println("This is non static method m2");
	
	
}
public void m3() {
	m1();
	System.out.println(a);
	m2();
	System.out.println(b);
	
}
public static void main(String[]args) {
	//static method can access static member directly(without creating object)
	m1();
	//static method can access non static member by creating object
	StaticExample se=new StaticExample();
	se.m2();
	System.out.println(se.b);
	se.m3();
	
}

}
