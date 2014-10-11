package org.hillel.it.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.hillel.it")
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