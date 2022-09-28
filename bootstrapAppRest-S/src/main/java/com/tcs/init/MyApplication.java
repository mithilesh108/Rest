package com.tcs.init;

import java.util.HashSet;
import java.util.Set;

import com.tcs.resource.StockReport;

import jakarta.ws.rs.core.Application;

public class MyApplication extends Application {

	private Set<Class<?>> classes;
	private Set<Object> singletons;

	public MyApplication() {
		singletons = new HashSet<Object>();
		classes = new HashSet<Class<?>>();
		
		singletons.add(new StockReport());
		classes.add(StockReport.class);
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
}
