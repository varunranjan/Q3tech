package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;



@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class Config {

	
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource =new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("admin");
		return driverManagerDataSource;
	}
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	/*
	 * @Bean(name = "studentDao") public StudentDao getStudentDaoImpl() { return new
	 * StudentDaoImpl(getJdbcTemplate()); }
	 */
}
