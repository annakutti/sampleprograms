/*package sanya.com.springboot.app2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class StudentSecurity extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
		authenticationManagerBuilder.inMemoryAuthentication().withUser("christy")
		.password("jessy").roles("PM");
	}

	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.antMatcher("/**").authorizeRequests().anyRequest().hasRole("PM")
		.and().formLogin().loginPage("/login")
		.failureUrl("/error").loginProcessingUrl("/login")
		.permitAll().and().logout()
		.logoutSuccessUrl("/students");
	}
}
*/