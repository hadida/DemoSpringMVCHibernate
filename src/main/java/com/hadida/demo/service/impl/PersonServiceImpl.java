package com.hadida.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadida.demo.dao.PersonDAO;
import com.hadida.demo.model.Person;
import com.hadida.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO personDao;
    
	@Override
	public void add(Person person) {
		personDao.add(person);

	}

	@Override
	public void edit(Person person) {
		personDao.edit(person);
	}

	@Override
	public void delete(int personId) {
		personDao.delete(personId);

	}

	@Override
	public Person getPerson(int personId) {
		return personDao.getPerson(personId);
	}
	
	@Override
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}

}
