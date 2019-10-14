package MyServlets;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/Navigation")
public class CountryByCity {

	
	@GET
	@Path("/{parameter}")
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
			
		return Response.status(200).entity(output).build();
	}
}
