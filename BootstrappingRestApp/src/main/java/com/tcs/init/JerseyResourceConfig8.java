/*package com.tcs.init;

import org.glassfish.jersey.server.ResourceConfig;

import com.tcs.resource.StockReport;
import com.tcs.resource.WeatherReport;

import jakarta.ws.rs.ApplicationPath;

//#8 option to bootstrapping the rest application  using @ApplicationPath("/api/*") annotations, in this case web.xml not required
@ApplicationPath("/api/*")
public class JerseyResourceConfig8 extends ResourceConfig {

	public JerseyResourceConfig8() {	
		//if we pass resource class as .class then container will follow req per obj model
		//if we manually create the object of resource and pass the ref as register method then container will treat as singleton resource
		super.register(StockReport.class).register(new WeatherReport());
	}
}
*/

