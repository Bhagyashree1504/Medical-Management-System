package medicalstoremanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	Connection c;
	Statement s ;
 DB()  {
		// TODO Auto-generated constructor stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");		
		String url = "jdbc:mysql://localhost:3306/medicalstore";
		String username = "root";
		String password = "Ankita@1315";
		c = DriverManager.getConnection(url, username, password);
		s = c.createStatement();}
		catch(Exception e){
			e.printStackTrace();
		}
 }

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	new DB();
	}
}

