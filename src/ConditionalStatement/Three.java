package ConditionalStatement;

public class Three {
public static void main(String[]args) {
	int a=1700;
	int b=600;
	int c=190;
	int d=100;
	if(a>b&a>c&a>d) {
		System.out.println("A is largest number than b,c,d");
	}else if(b>a&b>c&b>d) {
		System.out.println("B is the largest number than a,c,d");
	}else if(c>d&c>a&c>b) {
		System.out.println("C is largest number than a,b,d");
	}else {
		System.out.println("D is largest number than a,b,c");
	}
}
}
