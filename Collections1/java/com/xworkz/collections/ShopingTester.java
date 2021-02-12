package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.ShopingCartDTO;

public class ShopingTester {

	public static void main(String[] args) {
		ShopingCartDTO cartdto1 = new ShopingCartDTO();
		cartdto1.setName("jeans");
		cartdto1.setPrice(1500);
		cartdto1.setQuantity(1);
		ShopingCartDTO cartdto2 = new ShopingCartDTO();
		cartdto2.setName("shoe");
		cartdto2.setPrice(1800);
		cartdto2.setQuantity(1);
		Collection<ShopingCartDTO> cartDTOs = new ArrayList<ShopingCartDTO>();
		cartDTOs.add(cartdto1);
		cartDTOs.add(cartdto2);
		ShopingCartDTO cartdto3 = new ShopingCartDTO();
		cartdto3.setName("shoe");
		cartdto3.setPrice(1400);
		cartdto3.setQuantity(1);
		boolean contain=cartDTOs.contains(cartdto3);
		System.out.println("Contains"+contain);

		/*
		 *  for (ShoppingCartDTO shoppingCartDTO : cartDTOs) {
		 * if(shoppingCartDTO.getItemName().equals("Shoe")) {
		 * System.out.println("shoe is in cart"); } else {
		 * System.out.println("shoe is not in cart, can add"); } }
		 */
		if (contain) {
			System.out.println("shoe is in cart");
		} else {
			System.out.println("adding shoe to cart");
			cartDTOs.add(cartdto3);
		}
		System.out.println("after adding shoe" + cartDTOs.size());

		Collection<String> countrys = new ArrayList<String>();
		countrys.add("INDIA");
		countrys.add("AUSTRALIA");

		countrys.contains("INDIA");

	}
}
