package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class MobileCollection {

	public static void main(String[] args) {

		Collection<Long> mobileNumbers = new ArrayList();
		mobileNumbers.add(8310766234l);
		mobileNumbers.add(8310766234l);
		mobileNumbers.add(9310766212l);
		mobileNumbers.add(9876766234l);
		mobileNumbers.add(9807766235l);
		mobileNumbers.add(8310766232l);
		mobileNumbers.add(7850766256l);
		mobileNumbers.add(9070766223l);
		mobileNumbers.add(7310896222l);
		for (Long mobileNo : mobileNumbers) {

			String convertedMobileNo = mobileNo.toString();
			Character last = convertedMobileNo.charAt(convertedMobileNo.length() - 1);
			System.out.println(last);
			if (Integer.parseInt(last.toString()) > 3) {
				System.out.println("mobile number is greater" + convertedMobileNo);

			}
		}
	}
}