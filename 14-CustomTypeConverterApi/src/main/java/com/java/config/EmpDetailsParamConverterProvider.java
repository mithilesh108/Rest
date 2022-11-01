package com.java.config;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import com.cts.bean.EmpDetails;

import jakarta.ws.rs.ext.ParamConverter;
import jakarta.ws.rs.ext.ParamConverterProvider;

public class EmpDetailsParamConverterProvider implements ParamConverterProvider {

	@Override
	public  ParamConverter getConverter(Class rawType, Type genericType, Annotation[] annotations) {
		if(rawType.isAssignableFrom(EmpDetails.class))
			return new EmpDetailsConverter();
		return null;
	}
}
