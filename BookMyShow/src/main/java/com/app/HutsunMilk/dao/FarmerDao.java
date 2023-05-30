package com.app.HutsunMilk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.HutsunMilk.db.DataBaseCon;
import com.app.HutsunMilk.entity.FarmerInfo;

public class FarmerDao
{
	public  void saveFarmerInfo(FarmerInfo farmerinfo)
	{
		Configuration con = new Configuration();
		con.addProperties(DataBaseCon.getConnection());
		con.addAnnotatedClass(FarmerInfo.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transcation = session.beginTransaction();
		session.save(farmerinfo);
		transcation.commit();
		session.close();
	}
}
