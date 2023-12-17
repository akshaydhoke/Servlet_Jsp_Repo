package com.Servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

// DAO - data access object 
// DAO class contains database logic 

public class LoginDAO {

	public boolean validate(String name, String password) 
	{
		boolean flag=false;
		
		
		try
		{
			DriverManager.registerDriver(new Driver());
				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1997");
			
			PreparedStatement st=con.prepareStatement("select * from login where uname=? and password=?");
			
			st.setString(1, name);
			
			st.setString(2, password);
														
			
			ResultSet rs=st.executeQuery();  
			
			if(rs.next())
				flag=true;
			
		}
		catch(Exception e)
		{
			
		}
		
		return flag;
		
	}
}
