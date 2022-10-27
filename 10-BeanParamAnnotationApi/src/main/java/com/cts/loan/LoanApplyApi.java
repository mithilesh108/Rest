package com.cts.loan;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/loan")
public class LoanApplyApi {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String applyLoan(LoanApplication loan) {
		System.out.println(loan);
		return loan.toString();
	}
	//@FormParm works only POST request
	//@DefaultValue we can use with @QueryParam and @FormParam
	// if you dont pass @PathParam then 405 error will come
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{loanType}")
	public Response applyLoan1(@BeanParam LoanApplication loan) {
		System.out.println(loan);
		return Response.status(200).entity(loan.toString()).build();
	}
}
