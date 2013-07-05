package com.dm.authentication;

import com.dm.authentication.health.AuthenticationHealthCheck;
import com.dm.authentication.resources.AuthenticationResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class AuthenticationService extends Service<AuthenticationConfiguration> {
	
	public static void main(String[] args) throws Exception {
        new AuthenticationService().run(args);
    }
	
	@Override
	public void initialize(Bootstrap<AuthenticationConfiguration> bootstrap) {
		bootstrap.setName("authentication-service");
	}

	@Override
	public void run(AuthenticationConfiguration configuration, Environment environment) throws Exception {
		environment.addResource(new AuthenticationResource());
		environment.addHealthCheck(new AuthenticationHealthCheck());
	}
}
