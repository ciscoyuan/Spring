package com.finals.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.finals.common.db.template.BaseService;
import com.finals.sys.model.Users;
import com.finals.sys.model.UsersExample;

@Path("user")
@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
@Consumes
public interface UsersService extends BaseService<Users, UsersExample> {

	@GET
	@Path("{key}")
	Users testApi(@PathParam("key") int key);
	
}