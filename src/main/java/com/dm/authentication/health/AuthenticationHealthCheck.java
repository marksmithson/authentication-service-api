package com.dm.authentication.health;

import com.yammer.metrics.core.HealthCheck;

public class AuthenticationHealthCheck extends HealthCheck{

	public AuthenticationHealthCheck() {
		super("authentication");
	}

	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}

}
