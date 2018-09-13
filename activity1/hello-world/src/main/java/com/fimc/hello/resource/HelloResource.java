package com.fimc.hello.resource;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.fimc.hello.model.MessageRequest;


@Component
@Path("/_names")
public class HelloResource {
	
	 List<MessageRequest> person = new ArrayList<>();
	 
	 @POST
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response hello(MessageRequest request) {
		 if(StringUtils.isEmpty(request.getFirstName()) || StringUtils.isEmpty(request.getLastName()) || StringUtils.isEmpty(request.getBirthDate())) {
			 return Response.status(HttpServletResponse.SC_BAD_REQUEST).entity(HttpServletResponse.SC_BAD_REQUEST).build();
		 }else{	
			 person.add(request);
			 return Response.status(HttpServletResponse.SC_CREATED).entity(HttpServletResponse.SC_CREATED).build();
		 }
	 }
	 
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
		public Response getInfo() {
			 return Response.ok().entity(person).build();
		 }
}			
