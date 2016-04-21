package com.hadida.demo.dao.impl;

import java.util.List;

//import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hadida.demo.dao.PersonDAO;
import com.hadida.demo.model.Person;

@Repository
public class PersonDaoImpl implements PersonDAO {
	@Autowired
	private SessionFactory session;
	
	@Override
	@Transactional
	public void add(Person person) {
		session.getCurrentSession().save(person);

	}

	@Override
	@Transactional
	public void edit(Person person) {
		session.getCurrentSession().update(person);

	}

	@Override
	@Transactional 
		public void delete(int personId) {
		session.getCurrentSession().delete(getPerson(personId));
	}

	@Override
	public Person getPerson(int personId) {
		return (Person)session.getCurrentSession().get(Person.class, personId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAllPerson() {
		return session.openSession().createQuery("from Person").list();
	}

}
