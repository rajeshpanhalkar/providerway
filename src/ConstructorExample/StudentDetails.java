package ConstructorExample;

public class StudentDetails {
int rollno;
String Name;
char grade;

public void display() {
	System.out.println("Student roll no is "+rollno);
	System.out.println("Student Name  is "+Name);
	System.out.println("Student greade no is "+grade);
}
public void getdetails(int a,String n,char g) {
	rollno=a;
	Name=n;
	grade=g;
}
StudentDetails(){
	//rollno=a;
//	Name=n;
	//grade=g;
}
public static void main(String[]args) {
	//StudentDetails sd=new StudentDetails();
	//sd.rollno=101;
	//sd.Name="Rajesh";
	//sd.grade='A';
	//sd.display();
	//System.out.println("=============================================");
	//StudentDetails sd2=new StudentDetails();
	//sd2. getdetails(102,"Aashish",'A');
	//sd2.display();
	
	
	

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}