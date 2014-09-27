package org.hillel.it.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer 
implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext 
			servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext 
		context = new 
				AnnotationConfigWebApplicationContext(
				);	
		context.setConfigLocation("org.hillel.it");
		servletContext.addListener(new 
				ContextLoaderListener(context));
	}

}
