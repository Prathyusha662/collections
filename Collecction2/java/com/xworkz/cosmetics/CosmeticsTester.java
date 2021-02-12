package com.xworkz.cosmetics;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class CosmeticsTester {

	public static void main(String[] args) {
		// data --- dto
		System.out.println("hghghbghj");
		CosmeticsDTO cosmeticDTO = new CosmeticsDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setType(CosmeticType.EYELASHES);
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShades(CosmeticShade.BROWN);
		//CosmeticDAO dao = new CosmeticDAOImpl();
		//dao.save(cosmeticDTO);
		CosmeticsDTO cosmeticDTO2 = new CosmeticsDTO("Mac", CosmeticShade.BLACK, CosmeticType.EYELENAR, 30, 2);
//Maybelline
		// Lakme
		//dao.save(cosmeticDTO2);
		CosmeticsDTO cosmeticDTO3 = new CosmeticsDTO("Lakme", CosmeticShade.GREEN, CosmeticType.EYELENAR, 20, 2);
		//dao.save(cosmeticDTO3);
		
		List<CosmeticsDTO> cosmeticDTOs=new ArrayList<CosmeticsDTO>();
		cosmeticDTOs.add(cosmeticDTO);
		cosmeticDTOs.add(cosmeticDTO2);
		cosmeticDTOs.add(cosmeticDTO3);
		
		for (CosmeticsDTO cosmeticDTO4 : cosmeticDTOs) {
			System.out.println(cosmeticDTO4.getBrand());
		}
		
		//Collections.sort( cosmeticDTOs);
		
		for (CosmeticsDTO cosmeticDTO4 : cosmeticDTOs) {
			System.out.println(cosmeticDTO4.getBrand());
		}
	}
}