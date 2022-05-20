package OverRiding;

public class Test {
public static void main(String[]args) {
	BankOfIndia boi=new BankOfIndia();
	System.out.println(boi.RateOfInterest());
	HDFC h=new HDFC ();
	System.out.println(h.RateOfInterest());
}
}
