package com.innovationM.spring.dao;

import java.util.List;

import com.innovationM.spring.entity.Person;

public interface PersonDao {
   void add(Person person);
   List<Person> listPersons();
}
