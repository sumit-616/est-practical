package com.pradeep.DoubleServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class ServletDouApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletDouApplication.class, args);
	}
	
	

	 @Bean
	    public ServletRegistrationBean<AddServlet> registerMyServlet() {
	        ServletRegistrationBean<AddServlet> bean = new ServletRegistrationBean<>(new AddServlet(), "/add");
	        bean.setLoadOnStartup(1);
	        return bean;
	    }

}
