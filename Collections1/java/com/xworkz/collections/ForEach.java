package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEach {

	public static void main(String[] args) {
		Collection<String> names = new ArrayList<String>();
		names.add("omkar");
		names.add("nikunj");
		names.add("drone");
		names.add("akshar");
		names.add("devendra");
//for each
//for(type ref:collection)
		for (String name : names) {
			System.out.println(name);
			if (name.equals("drone")) {
				//names.remove(name);
				System.out.println("cant remove parllely");
			}
		}
		System.out.println("size before removing " + names.size());
		Iterator iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
				
			
			if (name.equals("drone")) {
				iterator.remove();
			}
		}
		System.out.println(names);
		System.out.println("size after removing" + names.size());
	}

}
