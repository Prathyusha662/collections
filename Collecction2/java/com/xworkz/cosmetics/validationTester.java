package com.xworkz.cosmetics;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticsDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticsDTO;
import com.xworkz.cosmetics.serverice.CosmeticService;
import com.xworkz.cosmetics.serverice.CosmeticServiceImpl;

public class validationTester {
	public static void main(String[] args) {

		//CosmeticDAO dao=new CosmeticDAOImpl();
		
		CosmeticsDTO cosmeticDTO=new CosmeticsDTO();
		cosmeticDTO.setType(CosmeticType.CONSEALER);
		cosmeticDTO.setPrice(1000);
		cosmeticDTO.setShades(CosmeticShade.BLACK);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setBrand("MAC");
		//dao.save(null);
		
		List<CosmeticsDTO> list=new LinkedList<CosmeticsDTO>();
		
		CosmeticDAO dao=new CosmeticsDAOImpl(list);
		// Loose Coupling vs Tight Coupling
		//String com="Xworkz";
		CosmeticService service=new CosmeticServiceImpl(dao);
		
		service.validateAndSave(cosmeticDTO);
		
		
		CosmeticsDTO cosmeticDTO2=new CosmeticsDTO("Sugr",CosmeticShade.RED, CosmeticType.CONSEALER, 1000, 2);
		
		service.validateAndSave(cosmeticDTO2);
		System.out.println(service.cosmeticsSize());

		service.deleteByBrand("Sugr");
		
		System.out.println(service.cosmeticsSize());
	}		
	
}
