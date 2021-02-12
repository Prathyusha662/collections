package com.xworkz.cosmetics.serverice;

import com.xworkz.cosmetics.dto.CosmeticsDTO;

public interface CosmeticService {
	boolean validateAndSave(CosmeticsDTO cosmeticDTO);
void deleteByBrand(String brand);
	
	int cosmeticsSize();


}
