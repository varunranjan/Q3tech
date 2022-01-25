package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query = "insert into Student(id,name,state,city) values(?,?,?,?)";
		return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity(),
				student.getState());
	}

	public int update(Student student) {
		String query = "update student set name=?, city=? where id=?";
		return this.jdbcTemplate.update(query, student.getName(), student.getCity(),
				student.getId());
	}

	public int delete(int id) {
		String query = "delete from student where id=?";
		return this.jdbcTemplate.update(query,id);
	}

	public Student getStudent(int id) {
		String query = "select * from Student where id=?";
		return this.jdbcTemplate.queryForObject(query, new RowMapperImpl(), id); 
				
	}

	public List<Student> getAllStudent() {
		String query = "select * from Student";
		return this.jdbcTemplate.query(query, new RowMapperImpl()); 
	}

}
