package com.fdmgroup.JDBCExercise;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements Users {
	
	private static DBSingleton dbSingleton;

	public void addUser(User user) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT into Users(username, password, firstName, lastName, email, role, status) VALUES (?,?,?,?,?,?,?)");
		try {
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getRole());
			ps.setString(7, user.getStatus());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public User getUser(String username) {
		String query = "SELECT * FROM Books WHERE username = \"" + username + "\"";
		User u = new User();
		try {
			dbSingleton.getConnection();
			Statement s = dbSingleton.getConnection().createStatement();
			ResultSet rs = s.executeQuery(query);
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			u.setFirstName(rs.getString("firstName"));
			u.setLastName(rs.getString("lastName"));
			u.setEmail(rs.getString("email"));
			u.setRole(rs.getString("role"));
			u.setStatus(rs.getString("status"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return u;
	}

	public void removeUser(String username) {
		String query = "DELETE * FROM Books WHERE username = \'" + username + "\'";
		try {
			dbSingleton.getConnection();
			Statement s = dbSingleton.getConnection().createStatement();
			s.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> listUsers() {
		List<User> users = new ArrayList<User>();
		String query = "SELECT * FROM Users";
		ResultSet rs;
		try {
			dbSingleton.getConnection();
			Statement s = dbSingleton.getConnection().createStatement();
			rs = s.executeQuery(query);
			while(rs.next()) {
				User u = new User();
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setFirstName(rs.getString("firstName"));
				u.setLastName(rs.getString("lastName"));
				u.setEmail(rs.getString("email"));
				u.setRole(rs.getString("role"));
				u.setStatus(rs.getString("status"));
				users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
