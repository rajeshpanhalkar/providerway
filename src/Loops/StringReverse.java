package Loops;

public class StringReverse {

public static void main(String[]args) {
	String s="Rajesh";
	String r="";
	System.out.println(s.length());
	
	for(int i=s.length()-1;i>=0;i--) {
		
	r=r+s.charAt(i);
	}
	System.out.println(r);
	}
}

