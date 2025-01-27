package com.mandar.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mandar.config.DatabaseConfig;
import com.mandar.entity.User;

public class UsersModel {

//here we define all the operations related to the database 
//we use the Data

	public List<User> listuser() {
		List<User> listUsers = new ArrayList<User>();

		// step 1 - get the connection object init
		Connection connection = DatabaseConfig.getConnection();

		// statement and result set objects
		Statement statement = null;
		ResultSet result = null;

		try {

			// create the db query
			String query = "select * from users";
			statement = connection.createStatement();
			result = statement.executeQuery(query);

			while (result.next()) {
				listUsers.add(
						new User(result.getInt("user_id"), result.getString("username"), result.getString("email")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listUsers;
	}

	public void addUser(User newUser) {

		String username = newUser.getUsername();
		String email = newUser.getEmail();

		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = DatabaseConfig.getConnection();
			String query = "insert into users (username, email) values (?, ?)";
			statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateUser(User user) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = DatabaseConfig.getConnection();
			String query = "update users set username = ?, email = ? where user_id = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getEmail());
			statement.setInt(3, user.getUser_id());

			statement.executeUpdate();
			System.out.println("Update executed successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteUser(int user_id) {
		
		Connection connection = DatabaseConfig.getConnection();
		PreparedStatement statement = null;
		
		try {
			
			String query = "delete from users where user_id = ?";
			statement = connection.prepareStatement(query);
			statement.setInt(1, user_id);
			statement.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
