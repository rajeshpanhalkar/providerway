package CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeSet {

public static void main(String[]args) {
	java.util.TreeSet t =new java.util.TreeSet();
	t.add("This");
	t.add("is");
	t.add("implementation class of");
	t.add("set interface");
	//t.add(null);
	//t.add(null);
	t.add("This");
	System.out.println(t.first());
	System.out.println(t.last());
	String val="is";
	System.out.println("Higher value of is element :- "+t.higher(val));
	System.out.println("Lower value of is element :- "+t.lower(val));
	t.pollFirst();
	System.out.println(t.pollFirst());
	t.pollLast();
	System.out.println(t.pollLast());
	//t.remove(5);
	//System.out.println(t.remove(6));
//	Iterator itr=t.iterator() ;
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	ArrayList<String> al=new ArrayList<String>();
//	al.add("abc");
//	al.add("xyz");
//	al.add("lmn");
//	al.add("pqr");
//	al.add("klm");
////	t.addAll(al);
//	Iterator itr=t.iterator() ;
//	while(itr.hasNext()) {
//		System.out.print(itr.next()+" ");
	//}
}
}
