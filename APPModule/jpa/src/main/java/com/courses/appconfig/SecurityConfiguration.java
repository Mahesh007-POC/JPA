/*package com.courses.appconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

//@Configuration
//@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	@Autowired
	UserCredentials userCredentials;
	
	@Override

	protected void configure(HttpSecurity httpSecurity) throws Exception {

	// We don't need CSRF for this example

	httpSecurity.csrf().disable().authorizeRequests().anyRequest().authenticated().and().formLogin();
	}
	
	

@Autowired

public void configure(AuthenticationManagerBuilder auth) throws Exception {

// configure AuthenticationManager so that it knows from where to load

// user for matching credentials

// Use BCryptPasswordEncoder

auth.userDetailsService(userCredentials).passwordEncoder(NoOpPasswordEncoder.getInstance());

}

}
*/