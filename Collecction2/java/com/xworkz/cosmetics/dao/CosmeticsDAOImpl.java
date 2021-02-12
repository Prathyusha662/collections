package com.xworkz.cosmetics.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class CosmeticsDAOImpl implements CosmeticDAO {
	// declare the list of cosmetics
	private List<CosmeticsDTO> cosmetics;

	// intializing the values by using construtor of instance variables
	public CosmeticsDAOImpl(List<CosmeticsDTO> list) {
		this.cosmetics =list;
		System.out.println("created CosmeticDAOImpl");
	}

	@Override
	public boolean save(CosmeticsDTO dto) {
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added) {
			System.out.println("cosmetics added" + dto);

		} else {

			System.out.println("cosmetics not added");
		}
		return added;
	}

	@Override
	public CosmeticsDTO findByBrand(String brand) {
		System.out.println("brand" + brand);
		for (CosmeticsDTO cosmeticDTO : this.cosmetics) {
			String brand1 = cosmeticDTO.getBrand();
			if (brand1.equals(brand)) {
				System.out.println("brand found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);
		System.out.println("brand:" + brand);

		CosmeticsDTO dto = this.findByBrand(brand);
		if (dto != null) {
			System.out.println("can update , price is found");
			dto.setPrice(price);
			dto.setQuantity(quantity);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String Brand, CosmeticType type) {
		System.out.println("invoking update price");
		System.out.println("price" + price);
		System.out.println("brand" + Brand);
		System.out.println("brand" + type);
		CosmeticsDTO dto2 = this.findByBrand(Brand);
		if (dto2 != null && dto2.getType().equals(type)) {
			System.out.println("can update");
			return true;
		} else {
			System.out.println("cant update");
			return false;
		}
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("invoked type");
		System.out.println("type" + type);
		System.out.println("brand" + brand);
		CosmeticsDTO dtot = this.findByBrand(brand);
		if (dtot != null) {
			System.out.println("can update type");
			dtot.setType(type);
			return true;
		} else {
			System.out.println("cant update type");
		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		//System.out.println("invoking delete ");
		//this.cosmetics.remove(cosmetics);
		//return true;
		Iterator<CosmeticsDTO> iterator=this.cosmetics.iterator();
        while(iterator.hasNext())
        {
      	  CosmeticsDTO dto=iterator.next();
      	  if(dto.getBrand().equals(brand))
      	  {
      		  iterator.remove();
      		  return true;
      	  }
        }
		return false;
	}
	

	@Override
	public void deleteAll() {
this.cosmetics.clear();
System.out.println("all elements are deleted");

	}

	@Override
	public List<CosmeticsDTO> getAll() {
		return this.cosmetics;
	}

	@Override
	public int totalSize() {
		int total = cosmetics.size();
		System.out.println("total number of" + total);
		return total;
	}

}
