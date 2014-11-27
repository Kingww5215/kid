package com.yuntu.kid.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConFactory {
	public static Connection getConnection() throws Exception {
		String driver = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/kid";

		String user = "root";

		String password = "root";

		Class.forName(driver);

		Connection conn = DriverManager.getConnection(url, user, password);

		return conn;
	}

}
