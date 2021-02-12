package com.xworkz.cosmetics.dao;

import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class AdvanceCosmeticDAOImpl implements CosmeticDAO {

	@Override
	public boolean save(CosmeticsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CosmeticsDTO findByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String Brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CosmeticsDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
