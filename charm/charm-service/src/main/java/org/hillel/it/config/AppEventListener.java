package org.hillel.it.config;

import org.hillel.it.event.ManualEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class AppEventListener implements
ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(
			ApplicationEvent event) {
		if(event instanceof ManualEvent) {
			System.out.println("Text:" + 
					((ManualEvent)event).getText());
		}
	System.out.println("Event:" + event.getClass() +
			" from " + event.getSource());	
	}

}