package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.orm.entity.Student;

@Component("studentDao")
public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void saveStudent(Student student) {
		hibernateTemplate.save(student);
	}
	@Transactional
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}

	public Student getStudentById(int id) {
		return hibernateTemplate.get(Student.class, id);
	}

	public List<Student> getAllStudent() {
		return hibernateTemplate.loadAll(Student.class);
	}
	@Transactional
	public void deletStudent(Student student) {
		hibernateTemplate.delete(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
