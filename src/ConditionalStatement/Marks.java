package ConditionalStatement;

public class Marks {
public static void main(String[]args) {
	int marks=76;
	if(marks<35){
		System.out.println("Fails");
	}else if(marks==35) {
		System.out.println("pass");
	}else if(marks>35&&marks<60) {
		System.out.println("second class");
	}else if(marks>=60&&marks<75) {
		System.out.println("first class");
	}else {System.out.println("distinction");
	}
}
}
