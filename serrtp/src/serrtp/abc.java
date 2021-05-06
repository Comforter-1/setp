package serrtp;

import java.sql.Connection;
import java.sql.DriverManager;

public class abc {
	public static void main(String args[]) {
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/setp","root","");
        if(!c.isClosed()) 
        	System.out.println("connected dgs");
         }catch(Exception e) {
        	System.err.println(e.getMessage());
        }
 	}

}
