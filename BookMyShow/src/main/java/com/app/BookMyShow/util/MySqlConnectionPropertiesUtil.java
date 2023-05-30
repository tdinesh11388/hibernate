package com.app.BookMyShow.util;

import java.util.Properties;

public class MySqlConnectionPropertiesUtil 
{
	public static Properties getDataBaseConnection()
	{
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/realm_db");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "root");
		return properties;
	}
}
