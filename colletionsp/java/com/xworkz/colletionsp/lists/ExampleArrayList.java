package com.xworkz.colletionsp.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExampleArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("rom");
		al.add("memory");
		System.out.println(al);
		// Iterating ArrayList using Iterator
		Iterator itr = al.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());
		}
//		  Iterating ArrayList using For-each loop
		for (String string : al) {
			System.out.println(string);
		}
		// Get and Set ArrayList
		System.out.println("the get element to" + al.get(0));
//set
		al.set(0, "bytes");
		for (String string : al) {
			System.out.println(string);
		}
		// How to Sort ArrayList
		List list = new ArrayList<String>();
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		// list.sort(list);
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
		}
		// diff types of loops iterating
		ArrayList<String> lis = new ArrayList<String>();// Creating arraylist
		lis.add("Ravi");// Adding object in arraylist
		lis.add("Vijay");
		lis.add("Ravi");
		lis.add("Ajay");

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = lis.listIterator(lis.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < lis.size(); i++) {
			System.out.println(lis.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		lis.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr1 = lis.iterator();
		itr1.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});

	}

}
