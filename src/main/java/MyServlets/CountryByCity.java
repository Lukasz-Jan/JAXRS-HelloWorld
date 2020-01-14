package MyServlets;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Navigation")
public class CountryByCity {

/*	
	@GET
	@Path("/{parameter}")
	@Produces(MediaType.APPLICATION_XML)
	public Response responseMsg(@PathParam("parameter") String parameter) 
	{
		//	http://localhost:8080/JAXRS-HelloWorld/restNav/Navigation/Gdansk
		
		String output = null;
		if(parameter.equals("Gdansk")) {
			
			output = parameter + " lies in: " + "Poland";
		}
		else {
			
			output = parameter + " not know where lies";
		}
		
		Country country = new Country(parameter);
			
		//return Response.status(200).entity(output).build();
		return Response.status(200).entity(country).build();
	}
	*/

	
//	https://www.logicbig.com/tutorials/java-ee-tutorial/jax-rs/xml-response.html	
	@GET
	@Path("/{parameter}")
	@Produces(MediaType.APPLICATION_XML)
	public Country responseMsg(@PathParam("parameter") String parameter) 
	{
		//	http://localhost:8080/JAXRS-HelloWorld/restNav/Navigation/Gdansk
		
		String output = null;
		if(parameter.equals("Gdansk")) {
			
			output = parameter + " lies in: " + "Poland";
		}
		else {
			
			output = parameter + " not know where lies";
		}
		
		Country country = new Country("Poland", parameter);
			
		//return Response.status(200).entity(output).build();
		return country;
	}	
	
}
