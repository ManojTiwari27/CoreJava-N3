package org.tnsif.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//data access object layer
public class EmployeeDao {
	
	public Connection createConnection()
	{
		String url="jdbc:mysql://127.0.0.1:3306/n3";
		String user="root";
		String password="Ms@2792000";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver name not found"+e);
		}
		Connection connection;
		try
		{
			connection=DriverManager.getConnection(url, user, password);
		}
		catch(SQLException e)
		{
			connection=null;
			System.out.println("User/url/password error"+e);
		}
		return connection;
	}
	

}
