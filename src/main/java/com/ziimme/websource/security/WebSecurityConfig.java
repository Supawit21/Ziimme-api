package com.ziimme.websource.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().authorizeRequests()
                .antMatchers("/backend/api/v1.0/**").permitAll()
                // .antMatchers("/api/v1.0/authentication").permitAll()
                // .antMatchers("/api/v1.0/facebook/search").permitAll()
                // .antMatchers("/api/v1.0/logs").permitAll()
                // .antMatchers("/api/v1.0/usagelogs").permitAll()
                // .antMatchers("/api/v1.0/farm_categories").permitAll()
                // .antMatchers("/api/v1.0/farm_categories/**").permitAll()
                // .antMatchers("/api/v1.0/projects").permitAll()
                // .antMatchers("/api/v1.0/projects/**").permitAll()
                // .antMatchers("/api/v1.0/projects_keywords/**").permitAll()
                // .antMatchers("/api/v1.0/projects_platforms/**").permitAll()
                // .antMatchers("/api/v1.0/post/**").permitAll()
                // .antMatchers("/api/v1.0/social_type").permitAll()
                // .antMatchers("/api/v1.0/social_type/**").permitAll()
                // .antMatchers("/api/v1.0/users").permitAll()
                // .antMatchers("/api/v1.0/users/**").permitAll()
                // .antMatchers("/api/v1.0/warehouses").permitAll()
                // .antMatchers("/api/v1.0/warehouses/**").permitAll()
                // .antMatchers("/api/v1.0/warehouse_farm_categories/**").permitAll()
                // .antMatchers("/api/v1.0/cron").permitAll()
                // .antMatchers("/api/v1.0/social/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilterBefore(new FilterCheck(),
                        UsernamePasswordAuthenticationFilter.class);
    }
}
