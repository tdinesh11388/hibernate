package com.app.HutsunMilk.dao;

import com.app.HutsunMilk.entity.FarmerInfo;

public class FarmerMainClass 
{
	public static void main(String[] args) 
	{
		FarmerInfo farmerInfo = new FarmerInfo();
		farmerInfo.setId(301);
		farmerInfo.setName("ThimmaNaidu");
		farmerInfo.setNumberOfCows("40");
		farmerInfo.setMilkQuantity("100");
		
		FarmerDao farmerDao = new FarmerDao();
		farmerDao.saveFarmerInfo(farmerInfo);
		
	}
}
