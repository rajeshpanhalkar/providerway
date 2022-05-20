package OverLoading;

public class OverloadingClass {
	 OverloadingClass(){
		 System.out.println("This is zero argument constructor");
	 }
	 OverloadingClass(int a){
		 System.out.println("This is argument construcor with int a"+a);
	 }
	 OverloadingClass(int a,int b){
		 System.out.println("This is argument construcor with int a,int b"+(a+b));
	 }
	 OverloadingClass(int a,double b){
		 System.out.println("This is argument construcor with int a,double b"+(a+b));
	 }
	 OverloadingClass(double a,double b){
		 System.out.println("This is argument construcor with double a,double b"+(a+b));
	 }
	 OverloadingClass(double a,double b,int c){
		 System.out.println("This is argument construcor with double a,double b,int c"+(a+b+c));
	 }
	 
}
