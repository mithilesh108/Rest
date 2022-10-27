package com.java.bank;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path(value = "/account")
public class AccountType {

	public AccountType() {
		System.out.println("obj created");
		// TODO Auto-generated constructor stub
	}
//	@GET
//	@Path(value = "/{name}/{mob}/saving/{status}")
//	public Response getSavingDetails(@PathParam(value = "name") String holderName, @PathParam("mob") Integer mobile,
//			@PathParam("status") Boolean status) {
//		System.out.println("AccountType getSavingDetails()" + " Holder Name : " + holderName + " Ac/No : " + mobile+" Status : "+status);
//		return Response.status(200).entity("Holder Name : " + holderName + " Ac/No : " + mobile+" Status : "+status).build();
//	}// http://localhost:8080/QueryParamAnnotationApi/account/mk/989898/saving/true1  
//	 // response :Holder Name : mk Ac/No : 989898 Status : false
	
//	@GET
//	@Path(value = "/{name}/{mob}/saving/{status}")
//	public Response getSavingDetails(@PathParam(value = "name") String holderName, @PathParam("mob") Integer mobile,
//			@PathParam("status") Boolean status, @MatrixParam("size") String size) {
//		System.out.println("AccountType getSavingDetails()" + " Holder Name : " + holderName + " Ac/No : " 
//			+ mobile+" Status : "+status+" Size : "+size);
//		return Response.status(200).entity("Holder Name : " + holderName + " Ac/No : " + mobile+" Status : "+status+
//				" "+status+" Size : "+size).build();
//	}// url : http://localhost:8080/QueryParamAnnotationApi/account/mk/989898/saving/true;size=9
//	 // res : Holder Name : mk Ac/No : 989898 Status : true true Size : 9
	
//	@GET
//	@Path(value = "/{name}/{mob}/saving/{status}")
//	public Response getSavingDetails(@PathParam(value = "name") String holderName,@MatrixParam("namel") List<String> namel,
//			@PathParam("mob") Integer mobile,
//			@PathParam("status") Boolean status, @MatrixParam("size") List<String> size) {
//		System.out.println("AccountType getSavingDetails()" + " Holder Name : " + holderName + " Ac/No : " 
//			+ mobile+" Status : "+status+" Size : "+size+" NmaeL : "+namel);
//		return Response.status(200).entity("Holder Name : " + holderName + " Ac/No : " + mobile+" Status : "+status+
//				" "+status+" Size : "+size+" NmaeL : "+namel).build();
//	}// url : http://localhost:8080/QueryParamAnnotationApi/account/mk/989898/saving/true;size=9;size=6;namel=8;namel=1
	 // Holder Name : mk Ac/No : 989898 Status : true true Size : [9, 6] NmaeL : [8, 1]
	
	@GET
	@Path(value = "/saving/{name: [a-z]+[0-9]+}")
	public Response getSavingDetails(@PathParam(value = "name") String holderName,@MatrixParam("extra") List<String> extra) {
		System.out.println("AccountType getSavingDetails()" + " Holder Name : " + holderName+" Matrix extra : "+extra);
		return Response.status(200).entity(" Holder Name : " + holderName+" Matrix extra : "+extra).build();
	}// url : http://localhost:8080/QueryParamAnnotationApi/account/saving/abc1234567;extra=ram;extra=shyam;extra=sita
	 // res :  Holder Name : abc1234567 Matrix extra : [ram, shyam, sita]
	 // [a-z]{3}[0-9]{7} it means only any 3 char and any 7 digit together
	 // [a-z]{3}[0-9]+  char only 3 but digit no condition either 1,2,3,4....n
	 // [a-z]+[0-9]+  char any alphabet no limit & digit no condition either 1,2,3,4....n
	@GET
	@Path(value = "/current/{acNo}/{status}")
	public Response getCurrentDetails(@PathParam("acNo") Integer acNo,@MatrixParam("extra") List<String> value, @PathParam("status") Boolean status) {
		System.out.println("AccountType getCurrentDetails()" + " Holder status : " + status + " Ac/No : " + (acNo)+" Extra : "+value);
		return Response.status(200).entity("Holder status : " + status + " Ac/No : " + acNo+" Extra : "+value).build();
	}// url : http://localhost:8080/QueryParamAnnotationApi/account/current/333/true;extra=bbb;extra=baa
	 // res : Holder status : true Ac/No : 333 Extra : [bbb, baa]
}
