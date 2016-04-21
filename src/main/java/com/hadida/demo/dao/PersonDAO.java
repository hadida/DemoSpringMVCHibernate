package com.hadida.demo.dao;

import java.util.List;

import com.hadida.demo.model.Person;



public interface PersonDAO {
	public void add(Person person);
	public void edit(Person person);
	public void delete(int personId);
	public Person getPerson(int personId);
	public List<Person> getAllPerson();
}
