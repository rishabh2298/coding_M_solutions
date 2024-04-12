package com.masai.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class AppConfig {

	@Bean
	public SecurityFilterChain springSecurityConfiguration(HttpSecurity http) throws Exception {

		http
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers(HttpMethod.POST, "/register").permitAll()
		.requestMatchers(HttpMethod.GET, "/findride").hasRole("ROLE_USER")
		.requestMatchers(HttpMethod.PUT, "book/{driverId}/{x}/{y}").hasRole("ROLE_USER")
		.requestMatchers(HttpMethod.PUT, "/user/{userId}").hasRole("ROLE_USER")
		.requestMatchers(HttpMethod.GET, "/user/**").hasRole("ROLE_ADMIN")
		.requestMatchers(HttpMethod.POST, "/user/**").hasRole("ROLE_ADMIN")
		.requestMatchers(HttpMethod.PUT, "/user/**").hasRole("ROLE_ADMIN")
		.anyRequest().authenticated().and()
		.addFilterAfter(new JwtTokenGeneratorFilter(), BasicAuthenticationFilter.class)
		.addFilterBefore(new JwtTokenValidatorFilter(), BasicAuthenticationFilter.class)
		.formLogin()
		.and()
		.httpBasic();

		return http.build();

	}

	
	@Bean
	public PasswordEncoder createPasswordEncoder() {

		return new BCryptPasswordEncoder();

	}

}