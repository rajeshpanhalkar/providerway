package CollectionExample;

import java.util.Map;
import java.util.Map.Entry;

public class HashMap {
public static void main(String[]args) {
	java.util.HashMap<Integer,String> hm=new java.util.HashMap<Integer,String>();
	hm.put(101, "abc");
	hm.put(102, "efg");
	hm.put(103, "pqr");
	hm.put(null, "abc");
	//hm.put(null, "abc");
	System.out.println(hm);
	System.out.println(hm.remove(101, "abc"));
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}


}
