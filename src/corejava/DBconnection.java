package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbURL="jdbc:mysql://localhost:3306/sampledatabase";
		String username="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(dbURL,username,password);
		Statement st=con.createStatement();
		String selectquery="select * from Persons";
		ResultSet rs=st.executeQuery(selectquery);
		while(rs.next()) {
			System.out.print(rs.getString("PersonID")+" ");
			System.out.print(rs.getString("Firstname")+" ");
			System.out.println(rs.getString("Lastname")+" ");

		
			
			



			
		}
		
	}

}
