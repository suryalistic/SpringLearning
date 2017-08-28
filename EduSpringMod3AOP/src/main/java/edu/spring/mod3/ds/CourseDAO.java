package edu.spring.mod3.ds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import edu.spring.mod3.beans.Course;

public class CourseDAO {
	@Autowired
	public BasicDataSource ds;
//	public BasicDataSource getDs() {
//		return ds;
//	}
//	public void setDs(BasicDataSource ds) {
//		this.ds = ds;
//	}

	public void insertCourse(Course course){
		String query = "Insert into course(CourseTitle,CourseId,Price) values (?,?,?)";
		Connection c = null;
		try {
			c = ds.getConnection();
			PreparedStatement ps = c.prepareStatement(query);
			ps.setString(1, "Dummy Course 301");
			ps.setString(2, "301");
			ps.setInt(3, 3000);
			int out = ps.executeUpdate();
			if(out != 0){
				System.out.println("Course Inserted");
			}else{
				System.out.println("Error inserting course");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
}
