package MethodExample;

public class Calculator {

public int sum(int x,int y) {
	return x+y;
}
public int subtr(int x,int y) {
	return y-x;
}
public int multi(int x,int y) {
	return x*y;
}
public int div(int x,int y) {
	return y/x;

}
public static void main(String[]args) {
	Calculator cal1=new Calculator();
	System.out.println(cal1.sum(100,200));
	System.out.println(cal1.subtr(300,200));
	System.out.println(cal1.multi(3,2));
	System.out.println(cal1.div(6,3));
	int ans=cal1.multi(20,30);
	System.out.println(ans-500);
	
}
}
