package com.courses.model;

import org.springframework.stereotype.Component;

@Component
public class AuthorizationToken {
private static	String authToken="qwqwqwqwqwqwtyqw";

public String getAuthToken() {
	return authToken;
}

public void setAuthToken(String authToken) {
	this.authToken = authToken;
}


}
