package org.hillel.it.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.hillel.it.charm.persistence.AppConfig;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Order(value = Ordered.HIGHEST_PRECEDENCE) 
public class AppInitializer 
implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext 
			servletContext)
			throws ServletException {
		servletContext.setInitParameter("contextConfigLocation", "");
		AnnotationConfigWebApplicationContext 
		context = new 
				AnnotationConfigWebApplicationContext(
				);	
		context.register(AppConfig.class);
		servletContext.addListener(new 
				ContextLoaderListener(context));
	}

}
