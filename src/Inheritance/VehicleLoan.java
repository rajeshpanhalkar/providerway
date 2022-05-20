package Inheritance;

public class VehicleLoan extends Loan {
	public void Vehicle() {
		System.out.println("Vehicle loan for two wheelar is 12%");
		System.out.println("Vehicle loan for Four wheelar is 15%");
	}
	public static void main(String[]args) {
		VehicleLoan VL=new VehicleLoan();
		VL.Vehicle();
		VL.Loan1("SHIVA", "8888888888", 52000.258, 1400);
	}

}
