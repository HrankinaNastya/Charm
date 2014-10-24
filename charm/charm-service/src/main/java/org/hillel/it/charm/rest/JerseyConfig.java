package org.hillel.it.charm.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("shop")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		packages("org.hillel.it");
	}

}
