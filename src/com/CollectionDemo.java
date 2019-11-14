package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> al=new HashMap<Integer, String>();
		al.put(10, "shiva");
		al.put(35, "prasad");
		al.put(65, "rama");
		al.put(58, "lakshman");
		al.put(13, "madhu");
		al.put(18, "manu");
		al.put(32, "guru");
		System.out.println(al);
		
		
		
		
		 for(Entry<Integer, String> values : al.entrySet()) {
			 System.out.println(values.getKey() +" - "+values.getValue());
		 }
		
		 

		 

	}

}
