package com.xworkz.cosmetics.dao;

import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public interface CosmeticDAO {
	boolean save(CosmeticsDTO dto);
	CosmeticsDTO findByBrand( String brand);

	boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);

	boolean updatePriceByBrandAndType(double price, String Brand, CosmeticType type);

	boolean updateTypeByBrand(String brand, CosmeticType type);

	boolean deleteByBrand(String brand);

	void deleteAll();

	List<CosmeticsDTO> getAll();

	int totalSize();

}
