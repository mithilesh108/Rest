package com.cts.loan;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.PathSegment;
import jakarta.ws.rs.core.UriInfo;

@Path("/loan")
public class LoanApplyApi {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{source}/{destination}/loan")
	public String applyLoan(@Context UriInfo uri) {
		System.out.println(uri);
		StringBuilder sb = null;
		List<PathSegment> listPathSegment = null;
		sb = new StringBuilder();
		listPathSegment = uri.getPathSegments();
		for (PathSegment ps : listPathSegment) {
			sb.append("/").append(ps.getPath());
			MultivaluedMap<String, String> matrixParms = ps.getMatrixParameters();
			sb.append(extractMultiValueMap(matrixParms, ";"));
		}
		MultivaluedMap<String, String> queryParms = uri.getQueryParameters();
		sb.append("?").append(extractMultiValueMap(queryParms, "&"));
		return sb.toString();
	}
	//url : http://localhost:8080/11-ContextAnnotationUriInfoHttpHeadersApi/loan/bgp/delhi/loan
	// res : /loan/bgp/delhi/loan?

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{source}/{destination}/header")
	public String getHeadersAndCookies(@PathParam("source") String source, @PathParam("destination") String destination,
			@Context HttpHeaders httpHeaders) {
		System.out.println(httpHeaders);
		StringBuilder sb = null;
		sb = new StringBuilder();
		sb.append("/").append(source).append("/").append(destination);
		MultivaluedMap<String, String> headers = httpHeaders.getRequestHeaders();
		sb.append("headers : ").append(extractMultiValueMap(headers, ";"));
		return sb.toString();
	}
	// url : http://localhost:8080/11-ContextAnnotationUriInfoHttpHeadersApi/loan/bgp/delhi/header
	//res : /bgp/delhiheaders : ;appcode=CPT549G;user-agent=PostmanRuntime/7.29.2;accept=*/*;
	//postman-token=71ff7aa5-c01b-42bd-89d6-0a238d77dfd5;host=localhost:8080;accept-encoding=gzip, deflate, br;connection=keep-alive;
	
	
	//content-type=application/x-www-form-urlencoded;content-length=73;cookie=sessionId=APAPA9090
	// @FormParm works only POST request
	// @DefaultValue we can use with @QueryParam and @FormParam
	// if you dont pass @PathParam then 405 error will come

	private String extractMultiValueMap(MultivaluedMap<String, String> map, String separtor) {
		StringBuilder sb = new StringBuilder();
		for (String paramName : map.keySet()) {
			List<String> paramValues = map.get(paramName);
			sb.append(separtor).append(paramName).append("=")
					.append(paramValues.stream().collect(Collectors.joining(",")));
		}
		System.out.println("extractMultiValueMap method : " + sb);
		return sb.toString();
	}
}
