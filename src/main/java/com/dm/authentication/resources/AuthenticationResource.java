package com.dm.authentication.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dm.authentication.core.Authentication;

@Path("/authenticate")
@Produces(MediaType.APPLICATION_JSON)
public class AuthenticationResource {

	@POST
	public Authentication authenticate(String username, String password){
		return new Authentication(username, true);
	}
	
	@GET
	public Authentication getAuthentication(String id){
		return new Authentication(id, true);
	}
}
