package com.xworkz.cosmetics.serverice;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class CosmeticServiceImpl implements CosmeticService {
	public CosmeticServiceImpl() {
		System.out.println("created");
	}
	private CosmeticDAO cosmeticDAO;
	// private String company;

	public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
		System.out.println("Created CosmeticServiceImpl");
		this.cosmeticDAO = cosmeticDAO;
	}

	@Override
	public boolean validateAndSave(CosmeticsDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is not null will validate feilds");
			String brand = cosmeticDTO.getBrand();// null,"v",""," "
			if (brand != null && brand.length() > 3 && !brand.isEmpty() && brand.contains("")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is not valid");
				validData = false;
			}
			CosmeticType type = cosmeticDTO.getType();
			if (validData) {
				if (type != null) {
					System.out.println("type is valid");
					validData = true;
				} else {
					System.out.println("tyoe is invalid");
					validData = false;
				}
			}
			CosmeticShade shade = cosmeticDTO.getShades();
			if (validData && shade != null) {
				System.out.println("shade is valid");
				validData = true;
			} else {
				System.out.println("shade is invalid");
				validData = false;
			}
			double price = cosmeticDTO.getPrice();
			if (validData && price > 0 && price < 2000) {
				System.out.println("price is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData = false;
			}
			int quantity = cosmeticDTO.getQuantity();
			if (validData && quantity > 0 && quantity <= 100) {
				System.out.println("quantity is valid");
				validData = true;
			} else {
				System.out.println("quantity is invalid");
				validData = false;
			}
		} else {
			System.out.println("dto is null invalid data");

		}
		return false;
	}
	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.cosmeticDAO.deleteByBrand(brand);
		} else {
			System.out.println("invalid brand");
		}

	}
	
	@Override
	public int cosmeticsSize() {
	
		return this.cosmeticDAO.totalSize();
	}

}
