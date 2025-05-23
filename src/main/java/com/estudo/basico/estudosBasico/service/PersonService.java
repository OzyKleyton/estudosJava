package com.estudo.basico.estudosBasico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.basico.estudosBasico.model.Person;
import com.estudo.basico.estudosBasico.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
}
