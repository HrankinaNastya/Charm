package org.hillel.it.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {
	
	//Beans
	
	@Bean
	public BeanProcessor beanProcessor() {
		return new BeanProcessor();
	}
	
	@Bean
	public AppEventListener appEventListener() {
		return new AppEventListener();
	}
}