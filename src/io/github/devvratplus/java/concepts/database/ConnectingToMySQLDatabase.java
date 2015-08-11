package io.github.devvratplus.java.concepts.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectingToMySQLDatabase {

	public static void main(String[] args) throws SQLException, IOException {

		Properties prop = new Properties();
		URL dbFileLocation = ConnectingToMySQLDatabase.class.getResource("db.properties");
		FileInputStream fis = new FileInputStream(dbFileLocation.getPath());
		prop.load(fis);
		
		String url = prop.getProperty("jdbc.url");
		String driver = prop.getProperty("jdbc.driver");
		String userName = prop.getProperty("jdbc.username");
		String password = prop.getProperty("jdbc.password");
		
		Connection conn = null;
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url, userName, password);

			// Now the connection will be established

			// ****************** STATEMENTS ******************
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("Select * from users");

			// pointing to the first row
			rs.next();

			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("city"));
			System.out.println(rs.getString("sex"));

			// now it points to the next row
			rs.next();

			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));

			// looping through the rows
			ResultSet rs1 = statement
					.executeQuery("Select * from users where sex='F'");
			while (rs1.next()) {
				System.out.println(rs1.getString(1) + "---" + rs1.getString(2)
						+ "---" + rs1.getString(3));
			}
			System.out.println("*****************************");

			// ******** PREPARED STATEMENTS *********

			selectStarFromUsersWhereNameAndSexIs(conn, "B", "M");
			selectStarFromUsersWhereNameAndSexIs(conn, "B", "F");

			// *****UDPATE THE DATABASE USING PREPAREDSTATEMENT******

			insertIntoUsersValuesNameCitySex(conn, "G", "G1", "M");
			selectStarFromUsersWhereNameAndSexIs(conn, "G", "M");

			// ******** CALLABLE STATEMENTS *********
			@SuppressWarnings("unused")
			CallableStatement cstatement = conn
					.prepareCall("INFO ABOUT STORED PROCEDURES");
			// TODO Check on the internet

		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("Done executing the statements!");
			conn.close();
		}
	}

	public static void insertIntoUsersValuesNameCitySex(Connection conn,
			String name, String city, String sex) throws SQLException {

		PreparedStatement pUpdateStatement = conn
				.prepareStatement("insert into users values(?,?,?)");
		pUpdateStatement.setString(1, name);
		pUpdateStatement.setString(2, city);
		pUpdateStatement.setString(3, sex);
		pUpdateStatement.executeUpdate();
	}

	private static void selectStarFromUsersWhereNameAndSexIs(Connection conn,
			String name, String sex) throws SQLException {

		PreparedStatement pstatement = conn
				.prepareStatement("select * from users where name=? and sex=?");
		pstatement.setString(1, name);
		pstatement.setString(2, sex);

		ResultSet resultSet = pstatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "---"
					+ resultSet.getString(2) + "---" + resultSet.getString(3));
		}
		System.out.println("*****************************");
	}

}
