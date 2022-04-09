package com.portfolio.backend.common;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.portfolio.backend.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo())
				;
	}
       
	
private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Portfolio Backend Servicios de API",
				"Portfolio Backend Servicios de API Descripción",
				"1.0",
				"https://backendargentinaprograma.herokuapp.com/api/",
				new Contact("Gerardo Romero Uro", "https://backendargentinaprograma.herokuapp.com/api", "jgromerouro@gmail.com"),
				"LIC.",
				"LIC. URL",
				Collections.emptyList()
				);
	}
}