package CollectionExample;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashSet {
public static void main(String[]args) {
	java.util.LinkedHashSet lhs=new java.util.LinkedHashSet();
	lhs.add("This");
	lhs.add("is");
	lhs.add("implementation class of");
	lhs.add("set interface");
	lhs.add(null);
	lhs.add(null);
	lhs.add("This");
	lhs.remove(5);
	System.out.println(lhs.remove(6));
	Iterator itr=lhs.iterator() ;
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
