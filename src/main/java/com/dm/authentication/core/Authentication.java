package com.dm.authentication.core;

public class Authentication {
	private final String username;
	private final boolean authenticated;
	
	public Authentication(String username, boolean authenticated){
		this.username = username;
		this.authenticated = authenticated;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public String getUsername() {
		return username;
	}
}
