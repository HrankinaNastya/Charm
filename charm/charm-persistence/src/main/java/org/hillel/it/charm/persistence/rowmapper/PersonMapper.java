package org.hillel.it.charm.persistence.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hillel.it.charm.model.entity.Person;
import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		
		person.setId(rs.getInt("id"));
		person.setName("name");
		person.setSurname("surname");
		
		return person;
	}

}