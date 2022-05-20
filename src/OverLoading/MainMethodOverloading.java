package OverLoading;

public class MainMethodOverloading {
public static void main(int a) {
	System.out.println(a);
}
public void main(int a,int b) {
	System.out.println(a+b);
}
public double main(int a,double b) {
	return a+b;
}
public static void main(String[]args) {
	main(10);
	MainMethodOverloading mo=new MainMethodOverloading();
	mo.main(10, 20);
	System.out.println(mo.main(10, 20.5));
}
}
