package org.hillel.it.charm.client;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hillel.it.charm.model.entity.Group;

public class GroupClient {
	private Client client;
	
	private static final String
	   BASE_URI = "http://localhost:8080/shop";
	
	public GroupClient() {
		client = ClientBuilder.newClient();
	}
	
	public List<Group> getGroups() {
		WebTarget target = client.target(BASE_URI);
		
		List<Group> groups = 
				target.path("groups").
				request(MediaType.APPLICATION_JSON)
				.get(new GenericType<List<Group>>() {});
		
		return groups;
	}
	
	public Group getGroup(String id) {
		WebTarget target = client.target(BASE_URI);
		
		Response response =  
				target.path("groups/" + id).
				request(MediaType.APPLICATION_JSON)
				.get();
		if(response.getStatus() != Status.OK.getStatusCode())  {
throw new RuntimeException("Invalid status code " + response.getStatus());			
		}
		
		return response.readEntity(Group.class);
	}	
	
	public void insertGroup(Group group) {
		WebTarget target = client.target(BASE_URI);
		
		Response response =  
				target.path("groups").
				request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(
						group, MediaType.APPLICATION_JSON));
		if(response.getStatus() != Status.OK.getStatusCode())  {
throw new RuntimeException("Invalid status code " + response.getStatus());			
		}		
	}
	
	public void deleteGroup(String id) {
		WebTarget target = client.target(BASE_URI);
		
		Response response =  
				target.path("groups/" + id).
				request(MediaType.APPLICATION_JSON)
				.delete();
		if(response.getStatus() != Status.OK.getStatusCode())  {
throw new RuntimeException("Invalid status code " + response.getStatus());			
		}		
	}	

}
