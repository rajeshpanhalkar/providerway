package PatternProgramme;

public class DecsendingOrderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method string
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
