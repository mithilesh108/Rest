package com.java.config;

import com.cts.bean.EmpDetails;

import jakarta.ws.rs.ext.ParamConverter;

public class EmpDetailsConverter implements ParamConverter<EmpDetails> {

	@Override
	public EmpDetails fromString(String idName) {
		EmpDetails e = new EmpDetails();
		e.setId(Integer.parseInt(idName.substring(0, 2)));
		e.setName(idName.substring(2, 6));
	    e.setAdd(idName.substring(5,8));
	    System.out.println(e);
	    return e;
	}

	@Override
	public String toString(EmpDetails value) {
		return value.toString();
	}

}
