package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class EmailCollection {
	// Create a collection , add 20 email ids and find the duplicates

	public static void main(String[] args) {
		String email = "prathyu@gmail.com";
		String email1 = "pra@gmail.com";
		String email2 = "prathyusha@gmail.com";
		String email3 = "harsha@gmail.com";
		String email4 = "vara@gmail.com";
		String email5 = "prashu@gmail.com";
		String email6 = "prasha@gmail.com";
		Collection emails = new ArrayList();
		boolean added = false;
		added = emails.add(email);
		System.out.println("added email" + added);
		added = emails.add(email1);
		System.out.println("added email" + added);
		added = emails.add(email2);
		System.out.println("added email" + added);
		added = emails.add(email3);
		System.out.println("added email" + added);
		added = emails.add(email4);
		System.out.println("added email" + added);
		added = emails.add(email5);
		System.out.println("added email" + added);
		added = emails.add(email6);
		System.out.println("added email" + added);
		int totalElements = emails.size();
		System.out.println("first time added elements" + totalElements);
		added = emails.add(null);
		System.out.println("the first duplicate:" + "" + added);
		added = emails.add(null);
		System.out.println("the second duplicate:" + "" + added);
		totalElements = emails.size();
		System.out.println("first time added elements" + totalElements);
		String email11 = "hansu@gmail.com";
		String email12 = "rama@gmail.com";
		String email13 = "anusha@gmail.com";
		String email14 = "malli@gmail.com";
		String email15 = "abc@gmail.com";
		added = emails.add(email11);
		System.out.println("added email" + added);
		added = emails.add(email2);
		System.out.println("added email" + added);
		added = emails.add(email3);
		System.out.println("added email" + added);
		added = emails.add(email4);
		System.out.println("added email" + added);
		added = emails.add(email5);
		emails.add(email15);
		emails.add(email14);
		emails.add(email13);
		emails.add(email12);
		System.out.println("added email" + added);
		totalElements = emails.size();
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(emails);

		ArrayList<Integer> listWithDuplicates = new ArrayList<>(hashSet);

		System.out.println(listWithDuplicates);

	}
}