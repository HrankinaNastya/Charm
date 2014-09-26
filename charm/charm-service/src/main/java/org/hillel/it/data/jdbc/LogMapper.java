package org.hillel.it.data.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LogMapper implements RowMapper<Log>{

	@Override
	public Log mapRow(ResultSet rs, int rowNum) throws SQLException {
		Log log = new Log();
		log.setDateCreated(rs.getDate("dateCreated"));
		log.setText(rs.getString("name"));
		return log;
	}

}