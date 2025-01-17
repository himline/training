package com.himline.Linkedlist;

import java.util.*;

public class Demo {
	
	public static void main (String args[])
	{
	// declare
	LinkedList<String> myList = new LinkedList<String>();
	LinkedList<String> yourList = new LinkedList<String>();
	HashSet hs1 = new HashSet();
	HashSet hs2 = new HashSet();
	HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
	HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
	TreeMap tm1 = new TreeMap();
	
    // print all element are empty
	System.out.println("isEmpty() before adding elements: "+myList.isEmpty());
	System.out.println("isEmpty() before adding elements: "+yourList.isEmpty());
	System.out.println("isEmpty() before adding elements: "+hs1.isEmpty());
	System.out.println("isEmpty() before adding elements: "+hm1.isEmpty());
	System.out.println("isEmpty() before adding elements: "+tm1.isEmpty());

	// linked list
	myList.add("anshu");
	myList.offer("a");
	myList.addFirst("chhavi");
	myList.addLast("sharma");
	myList.add(2,"rupal");
	myList.set(3,"amarjot");

	System.out.println("No. of elements: "+myList.size());
	System.out.println("isEmpty() after adding elements: "+myList.isEmpty());
	
	
	// RETRIEVING METHODS
	System.out.println("\ngetFirst(): "+myList.getFirst());
	System.out.println("getLast(): "+myList.getLast());
	System.out.println("get(3): "+myList.get(3));

	// peek and poll method
	System.out.println("\npeek(): "+myList.peek()); //  peek() method returns the element but not deletes it
	System.out.println("poll(): "+myList.poll()); //  poll() method returns and also deletes the element
	System.out.println("poll(): "+myList.poll());

	// REMOVING METHODS
	System.out.println("\nElements before removal: "+myList);
	System.out.println("remove(2): "+myList.remove(2));
	System.out.println("Elements after removal: "+myList);
	
	// SORTING IN ASCENDING ORDER
	Collections.sort(myList);System.out.println("Sorted elements: "+myList);

	// SHUFFLING
	Collections.shuffle(myList);System.out.println("\nFirst shuffle elements: "+myList);

	System.out.println("\naali exists: "+myList.contains("aali"));

	// USING ITERATOR
	System.out.print("\nElements with Iterator");
	Iterator it1 = myList.iterator();
	while(it1.hasNext())

	{
		System.out.print(it1.next() + " ");

	}
	
	// hash set
	hs1.add(10);
	hs1.add(10.5);
	hs1.add("hello");
	hs1.add("world");
	hs1.add(new StringBuffer("way2java"));
	hs1.add('A');System.out.println("hs1 elements: "+hs1);
	System.out.println("Contains element world: "+hs1.contains("world"));

	// ELEMENTS REMOVAL
	System.out.println("\nNo. of elements before remove(): "+hs1.size());
	System.out.println("Removal status: "+hs1.remove("world"));
	System.out.println("No. of elements after remove(): "+hs1.size());

	// USING HASHCODE
	HashSet hs3 = new HashSet();
	hs1.add(10);
	hs2.add(10.5);

	HashSet hs4 = new HashSet();
	hs3.add(10);
	hs3.add(10.5);

	int hc2 = hs3.hashCode();
	int hc3 = hs4.hashCode();
	System.out.println("\nHash code of hs2: "+hc2);
	System.out.println("Hash code of hs3: "+hc3);
	if(hs2.equals(hs3))

	{
		System.out.println("hs2 and hs3 contain same elements\n");
		System.out.println("elements in hs2  : " + hs2);
		System.out.println("elements in hs3 : " + hs3);

		// PRINTING ELEMENTS WITH ITERATOR
		System.out.print("Elements of hs3 with iterator: ");
		Iterator it11 = hs3.iterator();
		while (it11.hasNext()) {
			System.out.print(it11.next() + " ");
		}

		// hash MAP
		hm1.put("E", 69);
		hm1.put("A", 65);
		Set<String> mySet = hm1.keySet();
		System.out.print("foreach printing: ");
		for (String str : mySet) {
			System.out.print(str + ":" + hm1.get(str) + ", ");
		}

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.putAll(hm1);
		if (hm1.equals(hm)) {
			System.out.println("\n\nhm1 and hm contain the same elements");
			System.out.println("elements in hm : " + hm);
			System.out.println("elements in hm : " + hm1);

		}

		HashMap<String, Integer> hm3 = (HashMap) hm1.clone();
		System.out.println("\nElements of hm3: " + hm3);
	}

	// tree map
	tm1.put("station",1);
	tm1.put("mountain","red");
	tm1.put("hill",2);
	tm1.put("ride",3);

	System.out.println("tm1 isEmpty() after adding elements: "+tm1.isEmpty());
	System.out.println("Key/value pairs of tm1:"+tm1);

	System.out.println("\nmountain key exists: "+tm1.containsKey("mountain"));
	System.out.println("ride key exists: "+tm1.containsKey("ride"));
	System.out.println("\nmountain key exists: "+tm1.containsKey("mountain"));
	System.out.println("ride key exists: "+tm1.containsKey("ride"));

	System.out.println("\nNo. of elements before removal: "+tm1.size());
	tm1.remove("one");
	System.out.println("No. of elements after removal: "+tm1.size());
	tm1.clear();
	System.out.println("No. of elements after clear(): "+tm1.size());
}
}
