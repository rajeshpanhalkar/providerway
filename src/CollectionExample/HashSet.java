package CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class HashSet {
public static void main(String[]args) {
	java.util.HashSet s=new java.util.HashSet ();
	s.add("rd");
	s.add("rd");
	s.add(null);
	s.add(null);
	s.add(96);
	s.add(89);
	s.add(55);
	s.add(38);
	s.add(91);
	s.add('A');
	
	ArrayList al =new ArrayList();
	al.add("abc");
	al.add("def");
	al.add("ghi");
	s.addAll(al);
	s.remove(96);
	System.out.println(s.remove(89));
	System.out.println(s);
	Iterator itr = s.iterator();
	while(itr.hasNext()) {
	System.out.print(itr.next()+" ");}
}
}
