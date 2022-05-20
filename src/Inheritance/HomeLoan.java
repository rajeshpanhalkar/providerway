package Inheritance;

public class HomeLoan extends Loan {
	public void H() {
		System.out.println("For home loan rate of interest is 10%");
	}
	public static void main(String[]args) {
		HomeLoan HL= new HomeLoan();
		HL.Loan1("Raj", "9689553891", 50000.234, 1200);
		HL.H();
	}

}
