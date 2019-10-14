package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/xmlServices")
public class ConsumeStudentServiceXML {

	//	http://localhost:8080/JAXRS-HelloWorld/rest/xmlServices/studentXMLConsumer
	
    @POST
    @Path("/studentXMLConsumer")
    @Consumes(MediaType.APPLICATION_XML)
    public Response consumeXML( Student student ) {
 
    	System.out.println(student.getFirstName());
    	
        String output = student.toString();
 
        return Response.status(200).entity(output).build();
    }
}
