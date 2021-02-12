package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;
import com.xworkz.cosmetics.serverice.CosmeticService;
import com.xworkz.cosmetics.serverice.CosmeticServiceImpl;

public class ServiceTester {

	public static void main(String[] args) {
		System.out.println("hghfh");
		CosmeticsDTO cosmeticDTO = new CosmeticsDTO();
		cosmeticDTO.setBrand("mack");
		cosmeticDTO.setPrice(1234);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShades(CosmeticShade.LIGHT_PINK);
		cosmeticDTO.setType(CosmeticType.LIPSTICK);
		CosmeticService service = new CosmeticServiceImpl();
		service.validateAndSave(cosmeticDTO);
CosmeticsDTO cosmeticDTO2=new CosmeticsDTO("Sugr",CosmeticShade.RED, CosmeticType.CONSEALER, 1000, 2);
		
		service.validateAndSave(cosmeticDTO2);
		System.out.println(service.cosmeticsSize());

		service.deleteByBrand("Sugr");
		
		System.out.println(service.cosmeticsSize());
	}		
	

	}

