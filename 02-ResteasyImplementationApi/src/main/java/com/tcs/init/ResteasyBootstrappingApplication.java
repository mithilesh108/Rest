package com.tcs.init;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

// #6 option to bootstrapping the rest application  using @ApplicationPath("/api/*") annotations, 
// in this case web.xml not required container will create resource obj as req per obj model
// to change port no in wildfly server go to dire /standalone/configuration/standalone.xml port 8080 to 8082
@ApplicationPath("/api/*")
public class ResteasyBootstrappingApplication extends Application {

}

