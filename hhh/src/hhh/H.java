package hhh;
import java.sql.*;

public class H {
	
	public static void main(String[] args) throws Exception {
	System.out.println("hello");

	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaggi?autoReconnect=true&useSSL=false", "root", "raftaar");
		if(c!=null) {System.out.println("yes");}
		
		Statement t =c.createStatement();
	    ResultSet s = t.executeQuery("select * from jaggu where 1 ");
	   while(s.next()) {
	   System.out.println(s.getInt(1));
	   System.out.println(s.getString(2));}
	    		System.out.println("Iam the best ");
		
	}
catch(Exception e ) {
	
	System.out.println(e);
}
}
}
