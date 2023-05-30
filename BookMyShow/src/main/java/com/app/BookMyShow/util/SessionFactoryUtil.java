package com.app.BookMyShow.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.BookMyShow.entity.BookMyShowEntity;


public class SessionFactoryUtil 
{
	private static SessionFactory sessionFactory=null;
	
	static{
		Configuration configuration = new Configuration();
		configuration.setProperties(MySqlConnectionPropertiesUtil.getDataBaseConnection());
		configuration.addAnnotatedClass(BookMyShowEntity.class);
		 sessionFactory = configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
