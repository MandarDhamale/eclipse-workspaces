package com.mandar.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mandar.config.DatabaseConfig;
import com.mandar.entity.User;

public class UsersModel {

	public List<User> listuser(){
		List<User> listUsers = new ArrayList<User>();
		
		//step 1 - get the connection object init
		Connection connection = DatabaseConfig.getConnection();
		
		//statement and result set objects
		Statement statement = null;
		ResultSet result = null;
		
		try {
			
		//create the db query
		String query = "select * from users";
		statement = connection.createStatement();
		result = statement.executeQuery(query);
		
		while(result.next()) {
			listUsers.add(new User(result.getInt("user_id"), result.getString("username"), result.getString("email")));
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listUsers;
	}
	
	
}