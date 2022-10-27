/*package com.tcs.init;

import java.util.HashSet;
import java.util.Set;

import com.tcs.resource.StockReport;
import com.tcs.resource.WeatherReport;

import jakarta.ws.rs.core.Application;

// #7 option to bootstrapping the rest application, in this case web.xml required to configure MyApplication as servlet
public class MyApplication7 extends Application {

	private Set<Class<?>> classes;
	private Set<Object> singletons;

	public MyApplication7() {	
		singletons = new HashSet<Object>();
		classes = new HashSet<Class<?>>();
		//below obj will follow singleton obj model
		singletons.add(new StockReport());
		//below obj will follow request per obj model
		classes.add(WeatherReport.class);
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
*/