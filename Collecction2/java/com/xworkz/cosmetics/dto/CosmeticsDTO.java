package com.xworkz.cosmetics.dto;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;

public class CosmeticsDTO {
	private String brand;
	private CosmeticShade shades;
	private CosmeticType type;
	private double price;
	private int Quantity;

	/**
	 * @param brand
	 * @param shades
	 * @param type
	 * @param price
	 * @param quantity
	 */
	public CosmeticsDTO(String brand, CosmeticShade shades, CosmeticType type, double price, int quantity) {
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		Quantity = quantity;
	}

	public CosmeticsDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the shades
	 */
	public CosmeticShade getShades() {
		return shades;
	}

	/**
	 * @param shades the shades to set
	 */
	public void setShades(CosmeticShade shades) {
		this.shades = shades;
	}

	/**
	 * @return the type
	 */
	public CosmeticType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(CosmeticType type) {
		this.type = type;
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
		return Quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticsDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", Quantity=" + Quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals method");
		if (obj == null) {
			System.out.println("obj is null");
			return false;
		}
		if (obj instanceof CosmeticsDTO) {
			CosmeticsDTO dto = (CosmeticsDTO) obj;
			if (this.brand != null && this.type != null) {
				if(this.brand.equals(dto.getBrand())&&this.type.equals(dto.getType())) {
				
					System.out.println("cosmetic dto is equal"+dto.brand);
				return true;
			}
			}
		System.out.println("cosmetic dto is not equal");
		return false;
		}
	
	return false;
	}
}
