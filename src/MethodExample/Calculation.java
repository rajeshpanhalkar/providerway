package MethodExample;

public class Calculation {
int x=20;
int y=30;
public void sum() {
	System.out.println(x+y);
}
public int subtr() {
	return y-x;
}
public void multi(int a,int b) {
	System.out.println(a*b);}
public int div(int a,int b) {
	return a/b;
}
public static void main(String[]args) {
	Calculation cal=new Calculation();
	cal.sum();
	System.out.println(cal.subtr());
	
	cal.multi(10,20);
	System.out.println(cal.div(200, 100));
	
}
}
