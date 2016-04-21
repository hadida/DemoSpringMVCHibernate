package com.hadida.demo.service;

import java.util.List;

import com.hadida.demo.model.Person;

public interface PersonService {
	public void add(Person person);
	public void edit(Person person);
	public void delete(int personId);
	public Person getPerson(int personId);
	public List<Person> getAllPerson();

}
