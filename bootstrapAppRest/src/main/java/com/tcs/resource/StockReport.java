package com.tcs.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/stock")
public class StockReport {

	public StockReport() {
		System.out.println("StockReport hashcode : "+this.hashCode());
	}
	@GET
	@Path("/report")
	public Response getStockReport() {
		System.out.println("getStockReport");
		return Response.status(200).entity("Stock Market is UP").build();
	}
	
	
}
