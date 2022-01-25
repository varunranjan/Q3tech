package com.spring.orm;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.spring.orm.entity.Student;

@Configuration
@ComponentScan(basePackages = { "com.spring.jdbc.entity", "com.spring.orm.dao" })
public class Config {

	
	public static String getProperty(String key) {
		String value = "";
		try {
			Properties properties = new Properties();
			properties.load(new FileReader("application.properties"));
			value = properties.getProperty(key);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		return value;
	}

	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUsername(getProperty("jdbc.username"));
		ds.setPassword(getProperty("jdbc.password"));
		ds.setUrl(getProperty("jdbc.url"));
		return ds;
	}
	
	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean getSessionFactory() {
		List<String> classList = new ArrayList<String>();
		classList.add("com.spring.jdbc.entity.Student");

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.spring.orm" });
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", getProperty("hibernate.dialect"));
		hibernateProperties.put("hibernate.show_sql", getProperty("hibernate.show_sql"));
		hibernateProperties.put("hibernate.hbm2ddl.auto", getProperty("hibernate.hbm2ddl.auto"));
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
	}

	@Bean(name = "hibernateTemplate")
	@Autowired
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(sessionFactory);
		return hibernateTemplate;
	}

	@Bean(name = "transactionManager")
	@Autowired
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager tx = new HibernateTransactionManager();
		tx.setSessionFactory(sessionFactory);
		return tx;
	}
}
