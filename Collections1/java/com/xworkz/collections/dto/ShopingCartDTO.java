package com.xworkz.collections.dto;

public class ShopingCartDTO {
	private String name;
	private double price;
	private int quantity;
	
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public ShopingCartDTO(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public ShopingCartDTO() {
		super();
	}

	@Override
	public String toString() {
		return "ShopingCartDTO [name=" + name + ", price=" + price + ", quantity=" + quantity + 
				 ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals on shopping cart dto");
		// return super.equals(obj);
		// return true;
		if (obj == null) {
			return false;
		}
		if (obj instanceof ShopingCartDTO) {
			ShopingCartDTO casted = (ShopingCartDTO) obj;
			if (this.name.equals(casted.name) && this.price == casted.price) {
				System.out.println("item is matching" + casted.name);
				return true;
			}
		}

		return false;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
