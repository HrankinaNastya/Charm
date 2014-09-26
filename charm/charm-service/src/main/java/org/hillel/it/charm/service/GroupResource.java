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

@Path("groups")
public class GroupResource {
	private GroupService groupService 
	 = new GroupService();
	
	@GET
	@Produces({ 
		MediaType.APPLICATION_JSON
	})
	public List<Group> getGroups() {
		return groupService.getGroups();
	}

	@GET
	@Produces({ 
		MediaType.APPLICATION_JSON
	})
	@Path("{id}")
	public Response getGroup(@PathParam("id") String idParam) {
		if(!isInteger(idParam)) {
			return Response.status(
					Status.BAD_REQUEST).build();
		}
		int id = Integer.parseInt(idParam);
		
		Group group = groupService.getGroup(id);
		if(group == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok(group).build();		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Group update(Group group) {
		groupService.updateGroup(group);
		
		return group;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Group insert(Group group) {
		groupService.insertGroup(group);
		
		return group;
	}
	
	@DELETE
	@Produces({ 
		MediaType.APPLICATION_JSON
	})
	@Path("{id}")
	public Response delete(@PathParam("id") String idParam) {
		int id = Integer.parseInt(idParam);
		
		groupService.deleteGroup(id);
		return Response.ok().build();		
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
