package com.fdmgroup.factories;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

	private static String db_url;
	private static String db_user;
	private static String db_password;
	private static Connection conn;

	/**
	 * Default database parameters setup
	 */
	public DBSingleton() {

		db_url = "jdbc:oracle:thin:@localhost:1521:XE";
		db_user = "Trainee1";
		db_password = "!QAZSE4";

		// create instance of connection
		setConnection();
	}

	private static void setConnection() {
		// to set database connection
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "" + db_url;
			conn = DriverManager.getConnection(url, db_user, db_password);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static class DBSingletonManagerHolder {
		private static final DBSingleton INSTANCE = new DBSingleton();
	}

	// returns instance when DBSingleton class is called
	public static DBSingleton getInstance() {
		try {
			return DBSingletonManagerHolder.INSTANCE;
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
			return null;
		}

	}

	public Statement getStatement() {
		try {
			return conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Connection getConnection() {
		return conn;
	}

}
