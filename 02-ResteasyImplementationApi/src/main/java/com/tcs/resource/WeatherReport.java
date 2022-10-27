package com.tcs.resource;

//below imported from 3.x version
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;


@Path("/weather")
public class WeatherReport {

	public WeatherReport() {
		System.out.println("WeatherReport hashcode : "+this.hashCode());
	}
	
	@GET
	@Path("/report")
	public Response getWeatherReport() {
		System.out.println("getWeatherReport");
		return Response.status(200).entity("Weatherv is hot").build();
	}
	
	
}
