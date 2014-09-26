package org.hillel.it.event;

import org.springframework.context.ApplicationEvent;

public class ManualEvent extends ApplicationEvent{
	private static final long serialVersionUID = -7028871561436337646L;
	
	private String text;

	public ManualEvent(Object source,
			String text) {
		super(source);
		this.text = text;
	}

	public String getText() {
		return text;
	}

}