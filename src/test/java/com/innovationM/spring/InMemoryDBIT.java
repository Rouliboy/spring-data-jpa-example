package com.innovationM.spring;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;

import com.innovationM.spring.dao.PersonDao;
import com.innovationM.spring.entity.Person;

public class InMemoryDBIT extends TestIntegration {

	@Resource
	private PersonDao personDao;

	@Test
	public void givenStudent_whenSave_thenGetOk() {
		// final Student student = new Student(1, "john");
		// studentRepository.save(student);
		//
		// final Student student2 = studentRepository.findOne(1);
		// assertEquals("john", student2.getName());

		final Person person = new Person();
		person.setFirstName("Person1");
		personDao.add(person);
		assertEquals(1, personDao.listPersons().size());
	}
}