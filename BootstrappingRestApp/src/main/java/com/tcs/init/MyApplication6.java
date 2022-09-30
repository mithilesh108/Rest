/*package com.tcs.init;

import java.util.HashSet;
import java.util.Set;

import com.tcs.resource.StockReport;
import com.tcs.resource.WeatherReport;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

// #6 option to bootstrapping the rest application  using @ApplicationPath("/api/*") annotations, in this case web.xml not required
@ApplicationPath("/api/*")
public class MyApplication6 extends Application {

	private Set<Class<?>> classes;
	private Set<Object> singletons;

	public MyApplication6() {	
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
