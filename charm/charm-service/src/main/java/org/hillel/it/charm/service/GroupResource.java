package org.hillel.it.charm.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hillel.it.charm.model.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("/groups")
@Component
public class GroupResource {
	@Autowired
	CharmService charmService;
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public Group insert(Group group) {
		charmService.addGroup(group);	
		return group;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTest2() {
		Group group = insert(new Group("dresses"));
		
		return "Create user: emain - " + group.getNameGroup();
	}

	
	private boolean isInteger(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}