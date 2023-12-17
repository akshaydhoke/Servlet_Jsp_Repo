package com.Servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.Driver;



public class HibernateLoginDAO {

	public boolean validate(String name, String password) 
	{
		boolean flag=false;
		
		
		try
		{
			Configuration c = new Configuration();

			c.configure("hibernate.cfg.xml"); // configure() will load contents hibernate configuration file into Configuration object 
					
			SessionFactory	 sf = c.buildSessionFactory();
					
			Session	 session = sf.openSession();
			
			Query query=session.createQuery("from Login where uname=? and password=?"); 
			
			query.setParameter(0, name);
			query.setParameter(1, password);
			
			//list will contain Login class object if given username and password is correct
			
			List list=query.list();
					
			System.out.println("Size of list is " + list.size());
			
			if(list.size()>0)
				flag=true;
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
		
	}
	
}
