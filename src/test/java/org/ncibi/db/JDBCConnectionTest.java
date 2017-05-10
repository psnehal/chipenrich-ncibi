package org.ncibi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnectionTest {

	public static void main(String argv[]) throws Exception {

		Connection c;
		Statement s;

		String username = "userNcibiQueueService";
		String password = "280010use9Service";
		String name = "snehal";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		c = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/serverapps?autoReconnect=true", "chipenrich",
				"chipenrich");
		
		String sql = "Select uuid from ChipEnrichUrlLinkName where name = 'nov27test1'";
		s = c.createStatement();
		ResultSet results = s.executeQuery(sql);
		if (results != null)
		{
			while (results.next())
			{
				
				System.out.println("name = " + results.getString("uuid"));
				
			}
		}
	}

}
