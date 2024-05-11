package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectorFactory { 

	static Connection con =null;
	static String url = "jdbc:mysql://localhost:3306/employee";
	static String User_Name ="Bhanu";
	static String Pass_word = "Bhanu@25";
	


	public static Connection requestConection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection(url,User_Name,Pass_word);
		 return con;
	}
		
		

	
	
}


	


	 

    	 
    	
    
     
    	


			


