package com.estudo.basico.estudosBasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.basico.estudosBasico.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
