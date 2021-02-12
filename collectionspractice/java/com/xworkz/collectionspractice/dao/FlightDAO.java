package com.xworkz.collectionspractice.dao;

import java.util.List;

import com.xworkz.collectionspractice.constants.FlightNames;
import com.xworkz.collectionspractice.dto.FlightDTO;

public interface FlightDAO {
	public boolean save(FlightDTO dto);

	FlightDTO findByName(FlightNames name);

	boolean updatePriceByName(double price, FlightNames name);

	boolean deleteByName(FlightNames name);

	int flightSize();
	List<FlightDTO> getAll();
}
