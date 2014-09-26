package org.hillel.it.data.jdbc;

import java.util.Date;

public class Log {
	private Date dateCreated;
	
	private String text;

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}