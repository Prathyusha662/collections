package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Solution {
	public static void main(String[] args) {
		// collection is a framework
		// Array disadvantage is fixed size
		// no methods to manipulate (add delete)
		// no algorithms
		/// not dynamic in nature

		String cadbury = "Dairymilk";
		String nestle = "milkybar";
		String parle = "kiss me";
		String amul = "dark chocolate";
		Collection chocolates = new ArrayList();
		boolean added = false;
		added = chocolates.add(parle);
		System.out.println(added);
		added = chocolates.add(nestle);
		System.out.println(added);
		added = chocolates.add(amul);
		System.out.println(added);
		added = chocolates.add(cadbury);
		System.out.println(added);
		int total = chocolates.size();
		System.out.println("total number of chocolates" + total);
		System.out.println(chocolates);
		String hersheys = "hersheys kiss";
		String honey = "five star";
		added=chocolates.add(honey);
		System.out.println("added honey"+honey);
		added=chocolates.add(hersheys);
				System.out.println("added hershys"+added);
		boolean removed = chocolates.remove(null);
		System.out.println("Removed : " + removed);
		 // only while passing ref we get null pointer exception
		String ref = null;
		if (ref != null) {
			System.out.println(ref.toString());
			// return true;
		}
		added = chocolates.add(null);
		System.out.println("added null:" + added);
		added = chocolates.add(null);
		System.out.println("added null:" + added);
// else return false;
		total = chocolates.size();
		System.out.println("totalElements: " + total);

// chocolates.clear();
		chocolates.add(parle);
		total = chocolates.size();
		System.out.println("totalElements after adding duplicate: " + total);
		chocolates.remove(parle);
		chocolates.remove(parle);
		total = chocolates.size();
		System.out.println("totalElements: " + total);

// List chocolateList = new ArrayList();

		System.out.println("looping chocolates");

		Object[] convertedChocolates = chocolates.toArray();
		for (int i = 0; i < convertedChocolates.length; i++) {
			System.out.println(convertedChocolates[i]);
		}

		System.out.println("looping using iterator********************");

		Iterator iterator = chocolates.iterator();
//hasNext(),next();remove();
		while (iterator.hasNext()) {
			System.out.println("element present");
			Object str = iterator.next();
			System.out.println(str);

		}

	}
}
