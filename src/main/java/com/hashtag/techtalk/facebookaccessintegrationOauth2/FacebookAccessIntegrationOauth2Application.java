package com.hashtag.techtalk.facebookaccessintegrationOauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;


@EnableOAuth2Sso
@SpringBootApplication
@ComponentScan(basePackages = "com.hashtag.techtalk.facebookaccessintegrationOauth2")
public class FacebookAccessIntegrationOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(FacebookAccessIntegrationOauth2Application.class, args);
	}

}
