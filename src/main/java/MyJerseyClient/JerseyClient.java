package MyJerseyClient;

import com.javacodegeeks.enterprise.rest.jersey.Student;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class JerseyClient {

	public static void main(String[] args) {

        try {
        	 
            Student st = new Student("�ukasz", "Janowski", 12, 9);
 
            Client client = Client.create();
 
            WebResource webResource = client
                    .resource("http://localhost:8080/JAXRS-HelloWorld/rest/xmlServices/studentXMLConsumer");
 
            ClientResponse response = webResource.accept("application/xml")
                    .post(ClientResponse.class, st);
 
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
 
            System.out.println("Server response below: \n");
            System.out.println(output);
 
        } catch (Exception e) {
 
            e.printStackTrace();
        }
	}
}
