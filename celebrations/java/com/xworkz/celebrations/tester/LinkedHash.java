package com.xworkz.celebrations.tester;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {
	public static void main(String[] args) {

		new String();

		Set<String> favouritePlaces = new HashSet<String>();
		// Map
		favouritePlaces.add("Paris");
		favouritePlaces.add("Mauritius");
		favouritePlaces.add(null);
		favouritePlaces.add(null);
		favouritePlaces.add("Bali");

		System.out.println(favouritePlaces.size());
		favouritePlaces.forEach(e -> System.out.println(e));

		System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
		favouritePlaces = new LinkedHashSet<String>();
		favouritePlaces.add("Mysore");
		favouritePlaces.add("Hampi");
		favouritePlaces.add("Badami");
		favouritePlaces.add("Bijapur");
		favouritePlaces.forEach(e -> System.out.println(e));

	}
}
