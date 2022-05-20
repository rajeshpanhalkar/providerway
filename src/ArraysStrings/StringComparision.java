package ArraysStrings;

public class StringComparision {
public static void main(String[]args) {
	String s="Velocity";
	String s1="VELOCITY";
	String s2="Veloc";
	String s3="";
	String s4="This is Raj";
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s.contains(s2));
	System.out.println(s3.isEmpty());
	System.out.println(s.concat(s1));
	System.out.println(s.startsWith("Ve"));
	System.out.println(s4.replace("Raj", "Rajesh"));
	System.out.println(s.substring(0,2));
	String s5="Rajesh Bhimrao Panhalkar";
	String s6 []=s5.split(" ");
	for(int i=0;i<s6.length;i++) {
		System.out.print(s6[i]);
	}
}
}
