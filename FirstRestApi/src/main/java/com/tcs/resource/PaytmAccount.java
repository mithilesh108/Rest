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

@Path("/paytm/account")
public class PaytmAccount {

	@GET
	//@Produces(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public String getAccountNo(@QueryParam("name") String accountHolderName, @HeaderParam("header") String header) {
		System.out.println("PaytmAccount getAccountNo method : "+accountHolderName+" Header Value : "+header);
		return "Account Holder Name : "+accountHolderName +", A/C No : "+String.valueOf(10 * new Random().nextInt(99999));
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@Path("/{name}/{mobile}")
	public Response createAccountNo(@PathParam("name") String accountHolderName,
			@PathParam("mobile") String mobileNo, @HeaderParam("header") String header) {
		System.out.println("PaytmAccount createAccountNo method : "+accountHolderName+" Header Value : "+header);
		return Response.status(200).entity("Account Holder Name :"
				+ " "+accountHolderName +", Mob : "+mobileNo+" Header : "+header).build();
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	public Response updateAccountNo(@FormParam("name") String accountHolderName,
			@FormParam("mobile") String mobileNo, @HeaderParam("header") String header) {
		System.out.println("PaytmAccount updateAccountNo method : "+accountHolderName+" Header Value : "+header);
		return Response.status(200).entity("Account Holder Name :"
				+ " "+accountHolderName +", Mob : "+mobileNo+" Header : "+header).build();
	}
	
}
