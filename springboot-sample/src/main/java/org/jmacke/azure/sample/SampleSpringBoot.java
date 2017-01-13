package org.jmacke.azure.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SampleSpringBoot extends SpringBootServletInitializer { 

	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SampleSpringBoot.class);
    }

	
	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBoot.class, args);
	}
	
	
	
	
}
