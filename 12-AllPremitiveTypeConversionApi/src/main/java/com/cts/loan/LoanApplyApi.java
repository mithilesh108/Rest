package com.cts.loan;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/loan")
public class LoanApplyApi {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{name}/{age}/{status}/{salary}/{aadhar}/{mobile}/{gender}/{weight}")
	public String getPathParam(@PathParam("name") String empName, @PathParam("age") Byte empAge,
			@PathParam("status") Boolean marriedStatus, @PathParam("salary") Double empSalary,
			@PathParam("mobile") Integer empMobile, @PathParam("gender") Character gender,
			@PathParam("weight") Float empWeight, @PathParam("aadhar") Long empAadher) {
        System.out.println("getPathParam method");
		System.out.println("Name : " + empName + " Age : " + empAge + " Status : " + marriedStatus + " Salary : "
				+ empSalary + " Mobile : " + empMobile + " Gender : " + gender + " Weight : " + empWeight
				+ " Addhar Card : " + empAadher);
		return "Name : " + empName + " Age : " + empAge + " Status : " + marriedStatus + " Salary : " + empSalary
				+ " Mobile : " + empMobile + " Gender : " + gender + " Weight : " + empWeight + " Addhar Card : "
				+ empAadher;
	}
	// url should be make as @Path annotations standerds
	// url :
	// http://localhost:8080/12-AllPremitiveTypeConversionApi/loan/mk/23/false/23798.4/1234567890123/1234567890/m/62.5
	// res : Name : mk Age : 23 Status : false Salary : 23798.4 Mobile : 1234567890
	// Gender : m Weight : 62.5
	// Addhar Card : 1234567890123

	// content-type=application/x-www-form-urlencoded;content-length=73;cookie=sessionId=APAPA9090
	// @FormParm works only POST request
	// @DefaultValue we can use with @QueryParam and @FormParam
	// if you dont pass @PathParam then 405 error will come

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getQueryParam(@QueryParam("name") String empName, @QueryParam("age") Byte empAge,
			@QueryParam("status") Boolean marriedStatus, @QueryParam("salary") Double empSalary,
			@QueryParam("mobile") Integer empMobile, @QueryParam("gender") Character gender,
			@QueryParam("weight") Float empWeight, @QueryParam("aadhar") Long empAadher) {
		System.out.println("getQueryParam method");
		System.out.println("Name : " + empName + " Age : " + empAge + " Status : " + marriedStatus + " Salary : "
				+ empSalary + " Mobile : " + empMobile + " Gender : " + gender + " Weight : " + empWeight
				+ " Addhar Card : " + empAadher);
		return "Name : " + empName + " Age : " + empAge + " Status : " + marriedStatus + " Salary : " + empSalary
				+ " Mobile : " + empMobile + " Gender : " + gender + " Weight : " + empWeight + " Addhar Card : "
				+ empAadher;
	}
	// url : http://localhost:8080/12-AllPremitiveTypeConversionApi/loan?name=mithilesh&age=34&status=true&salary=34567.76&
	         //mobile=0987654321&gender=m&weight=45.98&aadhar=2345677898765434
	// res : Name : mithilesh Age : 34 Status : true Salary : 34567.76 Mobile :
	// 987654321 Gender : m Weight : 45.98 Addhar Card : 2345677898765434
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/header")
	public String getHeaderParam(@HeaderParam("name") String empName, @HeaderParam("age") Byte empAge,
			@HeaderParam("status") Boolean marriedStatus, @HeaderParam("salary") Double empSalary,
			@HeaderParam("mobile") Integer empMobile, @HeaderParam("gender") Character gender,
			@HeaderParam("weight") Float empWeight, @HeaderParam("aadhar") Long empAadher) {
		System.out.println("getHeaderParam method");
		System.out.println("Name : " + empName + " Age : " + empAge + " Status : " + marriedStatus + " Salary : "
				+ empSalary + " Mobile : " + empMobile + " Gender : " + gender + " Weight : " + empWeight
				+ " Addhar Card : " + empAadher);
		return "Name : " + empName + " Age : " + empAge + " Status : " + marriedStatus + " Salary : " + empSalary
				+ " Mobile : " + empMobile + " Gender : " + gender + " Weight : " + empWeight + " Addhar Card : "
				+ empAadher;
	}
	//url : http://localhost:8080/12-AllPremitiveTypeConversionApi/loan/header 
	//res : Name : kumar Age : 34 Status : false Salary : 45678.43 Mobile : 1234567890 Gender : M Weight : 34.98 Addhar Card : 34567845675678567
}
