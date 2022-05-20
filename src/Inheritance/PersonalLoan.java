package Inheritance;

public class PersonalLoan extends Loan {
	public void Personal () {
		System.out.println("Rate of interest for Personal loan is 8%");
	}
public static void main(String[]args) {
	 PersonalLoan PL=new  PersonalLoan();
	 PL.Personal();
	 PL.Loan1("Ashish", "9503353891", 50555.36, 1300);
	
}
}
