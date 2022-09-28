package com.tcs.resource;

import java.util.Random;

import jakarta.ws.rs.FormParam;
//below imported from 3.x version
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
//below imported from 2.x version
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import javax.ws.rs.core.MediaType;

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
