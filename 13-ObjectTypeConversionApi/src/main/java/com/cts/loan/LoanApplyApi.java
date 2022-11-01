package com.cts.loan;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/emp")
public class LoanApplyApi {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getQueryParam(@QueryParam("name") List<String> empList, @QueryParam("mob") Set<Integer> mobiles,
			@QueryParam("salary") Double[] salary) {
		System.out.println("getQueryParam method");
		System.out.println("Name : " + empList + " Emp mobiles : " + mobiles+" Salary : "+Arrays.toString(salary));
		return "Emps Name : " + empList + " Emp mobiles : " + mobiles+" Salary : "+Arrays.toString(salary);
	}
	// url : http://localhost:8080/12-AllPremitiveTypeConversionApi/emp?name=mk&name=vivek&mob=1234&mob=6543&salary=1234&salary=0987
	// res : Emps Name : [mk, vivek] Emp mobiles : [1234, 6543] Salary : [1234.0, 987.0]
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String getHeaderParam(@HeaderParam("name") List<String> empList, @HeaderParam("mob") Set<Integer> mobiles,
			@HeaderParam("salary") Double[] salary) {
		System.out.println("getHeaderParam method");
		System.out.println("Name : " + empList + " Emp mobiles : " + mobiles+" Salary : "+Arrays.toString(salary));
		return "Emps Name : " + empList + " Emp mobiles : " + mobiles+" Salary : "+Arrays.toString(salary);
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{idnameadd}")
	public String getPathParam(@PathParam("idnameadd") EmpDetails emp) {
		System.out.println("getPathParam method");
		System.out.println("Emp : " + emp);
		return "Emps Name : " + emp.toString();
	}// url : http://localhost:8080/12-AllPremitiveTypeConversionApi/emp/12rambgp
	 // res : Emps Name : EmpDetails [id=12, name=ramb, add=bgp]
}
