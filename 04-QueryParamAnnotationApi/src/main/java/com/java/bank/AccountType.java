package com.java.bank;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path(value = "/account")
public class AccountType {

	@GET
	@Path(value = "/saving/{status}")
	public Response getSavingDetails(@MatrixParam(value = "name") List<String> name, @QueryParam("acno") List<Integer> acNo,
			@PathParam("status") Boolean status) {
		System.out.println("AccountType getSavingDetails()" + " Holder Name : " + name + " Ac/No : " + acNo+" Status : "+status);
		return Response.status(200).entity("Holder Name : " + name + " Ac/No : " + acNo+" Status : "+status).build();
	}// http://localhost:8080/QueryParamAnnotationApi/account/saving?acno=909090&acno=98765&status=true
	//http://localhost:8080/QueryParamAnnotationApi/account/saving/false;name=hari;name=mk?acno=909090&acno=98765&status=true&acno=1111
	
	@GET
	@Path(value = "/current")
	public Response getCurrentDetails(@QueryParam("acno") Integer[] acno, @QueryParam("status") @DefaultValue("kumar") String status ) {
		System.out.println("AccountType getCurrentDetails()" + " Holder status : " + status + " Ac/No : " + Arrays.toString(acno));
		return Response.status(200).entity("Holder status : " + status + " Ac/No : " + Arrays.toString(acno)).build();
	}// http://localhost:8080/QueryParamAnnotationApi/account/current?acno=444&status=mk&acno=111&acno=333
}
