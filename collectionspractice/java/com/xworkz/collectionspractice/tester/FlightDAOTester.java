package com.xworkz.collectionspractice.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collectionspractice.constants.FlightNames;
import com.xworkz.collectionspractice.constants.Type;
import com.xworkz.collectionspractice.dao.FlightDAO;
import com.xworkz.collectionspractice.dao.FlightDAOImpl;
import com.xworkz.collectionspractice.dto.FlightDTO;

public class FlightDAOTester {

	public static void main(String[] args) {
		FlightDTO dto = new FlightDTO(FlightNames.DECCAN_AIRWAYS, Type.BUSSINESS, 2300, "gr123ed", true);
		
		List list = new ArrayList<FlightDTO>();
		FlightDAO dao=new FlightDAOImpl(list);
		dao.findByName(FlightNames.DECCAN_AIRWAYS);
		dao.deleteByName(FlightNames.INDIAN_AIRWAYS);
		dao.updatePriceByName(2000, FlightNames.DECCAN_AIRWAYS);
		dao.getAll();
		System.out.println("getall is done");
	}

}
