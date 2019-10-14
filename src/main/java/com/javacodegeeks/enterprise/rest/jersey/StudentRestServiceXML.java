package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.javacodegeeks.enterprise.rest.jersey.StudentJSON;

//	https://examples.javacodegeeks.com/enterprise-java/rest/jersey/xml-example-with-jersey-jaxb/

//	https://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson/

//	https://www.nabisoft.com/tutorials/java-ee/producing-and-consuming-json-or-xml-in-java-rest-services-with-jersey-and-jackson

@Path("/studentRestServiceXML")
public class StudentRestServiceXML {

	@GET
	@Path("/print/{name1}/{name2}")
	@Produces(MediaType.APPLICATION_XML)

	public Student responseMsg( @PathParam("name1") String name1, @PathParam("name2") String name2 ) {
		 
		//	http://localhost:8080/JAXRS-HelloWorld/rest/studentRestServiceXML/print/HP/Mercedes
		
		Student st = new Student(name1, name2 ,1, 22);

        return st;
 
    }
}