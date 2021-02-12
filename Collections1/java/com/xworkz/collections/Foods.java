package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Foods {

	public static void main(String[] args) {
		String food1 = "idly";
		String food2 = "dosa";
		String food3 = "puri";
		String cake = "redVelvet";
		String bonda = "aloo";
		Collection foodVarities = new ArrayList();
		boolean added = false;
		added = foodVarities.add(food1);
		added = foodVarities.add(food2);
		added = foodVarities.add(food3);
		added = foodVarities.add(cake);
		added = foodVarities.add(bonda);
int total=foodVarities.size();
System.out.println("the size is"+""+total);
foodVarities.contains(cake);
System.out.println("it contains the element"+foodVarities.contains(cake));
	foodVarities.contains("rava");
	System.out.println("it contains"+foodVarities.contains("rava"));
	
	}
}
