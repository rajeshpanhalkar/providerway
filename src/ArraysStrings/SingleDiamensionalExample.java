package ArraysStrings;

public class SingleDiamensionalExample {

	public static void main(String[]args) {
		int a []=new int [10];
		String r[]=new String[2];
	    a[0]=10;
		a[1]=20;
		a[2]=30;
	    a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;
		r[0]="Raj";
		r[1]="Panhalkar";
		System.out.println(a[6]);
		
		System.out.println(r.length);
		//Reading the array
		for(int i=9;i>=0;i--) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println(r[0]);
		
	}
	
	

}
