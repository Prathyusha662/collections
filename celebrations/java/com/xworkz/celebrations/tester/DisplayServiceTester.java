package com.xworkz.celebrations.tester;

import com.xworkz.celebrations.service.DisplayService;
import com.xworkz.celebrations.service.DisplayServiceImpl;

public class DisplayServiceTester {
	public static void main(String[] args) {
		DisplayService service = new DisplayServiceImpl();
		service.printString((l, t) -> {
			System.out.println("validating" + l + " t" + t);
			if (l.contains("a") || l.contains("A")) {
				System.out.println(l + " " + l.hashCode());
			}
		});

	}

}
