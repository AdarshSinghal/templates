
/*
Information Classification / DC2
RESTRICTED - NOT FOR EXTERNAL DISTRIBUTION
 
This material is the property of Global Payments and is intended solely for its use. This material is proprietary to Global Payments and has been furnished on a confidential and restricted basis.  Global Payments expressly reserves all rights, without waiver, election, or other limitation to the full extent permitted by law, and to this material and this information contained therein.  Any reproduction, use or display or other disclosure or dissemination, by a method now known or later developed, of this material or the information contained therein, in whole or in art, without prior written consent of Global Payments is strictly prohibited. Copyright © 2014-2019
*/
package com.sample.data.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.sample.data.constants.Constants;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration for Swagger customization
 * 
 * @author adarshsinghal
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration extends WebMvcConfigurationSupport {

	@Value("${app.swagger.controller.package}")
	private String controllerPackage;
	@Value("${app.swagger.desc}")
	private String description;
	@Value("${app.swagger.info}")
	private String apiInfo;
	// private static final String STRING = "string";
	// private static final String HEADER_STRING = "header";
	private static final String WEBJARS_PATH = "/webjars/**";

	@Bean
	public Docket productApi() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(controllerPackage)).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());

	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(Constants.SWAGGER_UI_PAGE_ADDRESS)
				.addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler(WEBJARS_PATH).addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	private ApiInfo apiInfo() {

		return new ApiInfo(apiInfo, description, null, null, null, null, null, Collections.emptyList());
	}

}
