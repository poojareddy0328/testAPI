package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")

public class Hello {
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello()
	{
		String resource = "<? xml version='1.0' ?>"+"<hello> Hi, This is from XML</hello>";
		return resource;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJASON()
	{
		String resource = null;
		return resource;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML()
	{
		String resource = "<h1>Hi, This is from HTML</h1>";
		System.out.println("Hello");
		return resource;
		
	}
	
}
