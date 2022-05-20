package CollectionExample;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
public static void main(String[]args) {
	Vector v=new Vector();
	v.add("abc");
	v.add("xyz");
	v.add("abc");
	//v.add(96);
	//v.add(null);
	//v.add(null);
	Collections.sort(v,Collections.reverseOrder());
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.capacity());
	Enumeration e=v.elements();
	while(e.hasMoreElements()) {
	System.out.print(e.nextElement()+" ");}
}






}
