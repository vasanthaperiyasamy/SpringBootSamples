package com.spring.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/","/list")
								.access("hasRole('USER') or hasRole('ADMIN') or hasRole('DBA')")
								.antMatchers("/newuser/**","/delete-user-*") .access("hasrole('ADMIN')")
								.antMatchers("/edit-user-*").access("hasrole('ADMIN') or hasRole('DBA')")
								.and().formLogin().loginPage("/login")
								.loginProcessingUrl("/login").usernameParameter("ssoId").passwordParameter("password")
								.and().rememberMe().rememberMeParameter("remember-me")
								.tokenRepository(null).tokenValiditySeconds(86400)
								.and().csrf().and().exceptionHandling().accessDeniedPage("/Access_Denied");
		
		
		
	}

}
