package com.cts.loan;

import com.cts.bean.EmpDetails;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/emp")
public class LoanApplyApi {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{empDetails}")
	public String getQueryParam(@PathParam("empDetails") EmpDetails emp) {
		System.out.println("getQueryParam method : "+emp);
		return emp.toString();
	}
}
