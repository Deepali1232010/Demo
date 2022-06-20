package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Collection {
	public static void main(String[] args) {
		
		ArrayList  al = new ArrayList();
		al.add("Velocity");
		al.add(6);
		al.add('C');
		al.add(22.22);
		al.add(null);
		al.add(null);
		
		for(int i = 0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		LinkedList ll = new LinkedList();
		ll.add(7);
		ll.add("Ram");
		ll.add(null);
		ll.add('D');
		ll.add(null);
		
		for(int i = 0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		Vector v =new Vector();
		v.add("Mahesh");
		v.add(44);
		v.add(null);
		v.add(true);
		v.add(false);
		v.add(null);
		//System.out.println(v.get(4));
		for(int i = 0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		
		PriorityQueue<String> pq =new PriorityQueue<String>();
		pq.add("Aeepali");
		pq.add("Beepali");
		pq.add("Ceepali");
		pq.add("45");
		//System.out.println(pq.peek());
		//System.out.println(pq.poll());
		System.out.println(pq);
		
		
		HashSet hs =new HashSet();
		hs.add("RaviTeja");
		hs.add("RaviTeja");
		hs.add(4);
		hs.add(4);
		hs.add(null);
		hs.add(null);
		
	Iterator it = hs.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(1, null);
	hm.put(null, null);
	hm.put(2, null);
	hm.put(1, "red");
	hm.put(3, "toy");
	 
	//System.out.println(hm.get(1));
	//System.out.println(hm.get(3));
	System.out.println(hm);
	
	
	Hashtable<String, String> ht = new Hashtable<String, String>();
	//ht.put("one", null);
	//ht.put(null, null);
	ht.put("two", "prem");
	ht.put("three", "More");
	
	System.out.println(ht.get("two"));
	System.out.println(ht.get("four"));
	System.out.println(ht.get("three"));
	}
	
	

}
