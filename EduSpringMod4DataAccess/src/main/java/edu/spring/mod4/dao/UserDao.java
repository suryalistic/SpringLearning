package edu.spring.mod4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import edu.spring.mod4.beans.User; 

public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate nameParamJdbcTemplate;
	
	public User getUserByUserName(String userName){
		User u = null;
		String query = "Select * from User where UserName=\'"+userName+"\'";
//		Map<String,User> userMap= (Map<String,User>)jdbcTemplate.queryForMap(query);
		System.out.println("UserMap>>"+jdbcTemplate.queryForMap(query));
		return u;
	}
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		String query = "Select * from User where LastName like ?";
		System.out.println(jdbcTemplate.queryForObject(query, new Object[]{"ya%"}, new UserRowMapper()));
//		System.out.println(jdbcTemplate.queryForList(query, User.class));
		return users;
	}
	
	private class UserRowMapper implements RowMapper<User>{

		public User mapRow(ResultSet rs, int rownum) throws SQLException {
			User user = new User();
			user.setFirstName(rs.getString("FirstName"));
			user.setLastName(rs.getString("LastName"));
			user.setUserName(rs.getString("UserName"));
			return user;
		}
		
	}
	
	public void insertUser(User user){
		String query = "Insert into User(FirstName,LastName,UserName) Values(:firstName,:lastName,:userName)";
		Map<String,String> params = new HashMap<String, String>();
		params.put("firstName", "dummyFirstName");
		params.put("lastName", "dummyLastName");
		params.put("userName", "dummyUserName");
		
		nameParamJdbcTemplate.update(query, params);
	}
}
