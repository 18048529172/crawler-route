package com.liw.crawler.route.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class CrawlerRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrawlerRouteApplication.class, args);
	}
}
