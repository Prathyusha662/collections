package com.xworkz.colletionsp.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collect {

	public static void main(String[] args) {
		//Collection<Integer> list = new ArrayList<Integer>();
		
		List<Integer> list = new ArrayList<Integer>();
//ArrayList<Integer> lis= new ArrayList<Integer>(); 
		//List<Integer> li = new LinkedList<Integer>();

		for (int i = 0; i < 5; i++)
			list.add(i);
		int dd=list.size();
		System.out.println(dd);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

}
