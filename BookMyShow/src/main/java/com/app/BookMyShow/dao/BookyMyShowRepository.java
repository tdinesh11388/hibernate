package com.app.BookMyShow.dao;

import com.app.BookMyShow.dto.BookMyShowDTO;
import com.app.BookMyShow.entity.BookMyShowEntity;
import com.app.BookMyShow.util.MySqlConnectionPropertiesUtil;
import com.app.BookMyShow.util.SessionFactoryUtil;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class BookyMyShowRepository 
{
	private SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
	
	public void saveOrUpdate(BookMyShowEntity bookentity)
	{
//		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
//		Configuration configuration = new Configuration();
//		configuration.setProperties(MySqlConnectionProperties.getDataBaseConnection());
//		configuration.addAnnotatedClass(BookMyShowEntity.class);
//		 SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transcation = session.beginTransaction();
		session.merge(bookentity);
		transcation.commit();
	}
	public BookMyShowEntity getMovieById(long alt_key)
	{
		Session session = sessionFactory.openSession();
		return session.get(BookMyShowEntity.class, alt_key);
	}
	public void updateData(BookMyShowDTO bookmydto)
	{
		BookMyShowEntity bookMyShowEntity = getMovieById(bookmydto.getAltKey());
		
		if(bookMyShowEntity!=null)
		{
			bookMyShowEntity.setMovieBudget(bookmydto.getMovieBudget());
			bookMyShowEntity.setReleaseDate(bookmydto.getMovieRelease());
			saveOrUpdate(bookMyShowEntity);
		}
	}
}
