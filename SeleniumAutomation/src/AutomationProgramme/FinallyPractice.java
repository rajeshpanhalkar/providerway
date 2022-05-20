package AutomationProgramme;

public class FinallyPractice {
	public static void main(String[] args) {
		System.out.println("Programme is started");
		int a=100;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			e.printStackTrace();
			b=10;
			System.out.println(a/b);
		}finally {
			System.out.println("close db");
		}
		System.out.println("programme is ended");
	}

}
