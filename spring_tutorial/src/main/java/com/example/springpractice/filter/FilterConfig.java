package com.example.springpractice.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	@Bean
	FilterRegistrationBean<HeaderFooterFilter> registerCorrectFilter() {
		
		FilterRegistrationBean<HeaderFooterFilter> regBean = new FilterRegistrationBean<>();
				regBean.setFilter(new HeaderFooterFilter());
				
				regBean.addUrlPatterns("/*");
				
				return regBean;
	}
}
