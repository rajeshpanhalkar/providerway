package CollectionExample;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
public static void main(String[]args) {
	ArrayList al=new ArrayList();
	al.add("Rajesh");
	al.add("Aashish");
	al.add("Shiva");
	al.add("Supriya");
	al.add("Tejshree");
	//al.add(7);
	al.set(0, "Panhalkar");
	
	Collections.sort(al);
	System.out.println(al);
	
}
}
