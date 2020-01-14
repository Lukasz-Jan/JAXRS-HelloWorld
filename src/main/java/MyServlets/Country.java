package MyServlets;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

//	https://docs.oracle.com/middleware/12211/wls/WSGET/jax-ws-datatypes.htm#WSGET181
//	https://howtodoinjava.com/jaxb/jaxb-annotations/


@XmlRootElement(name = "kraj")
public class Country implements Serializable{

	



	/**
	 * 
	 */
	private static final long serialVersionUID = 392256450017304307L;


	public Country() {}

	public Country(String country, String city) {
		this.name = country;
		this.city = city;
	}


	
	@XmlElement
	private String city;

	
	@XmlAttribute
	private String name;


}
