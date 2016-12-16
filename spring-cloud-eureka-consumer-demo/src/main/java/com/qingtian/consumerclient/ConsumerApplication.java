package com.qingtian.consumerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@ComponentScan
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication {
	
   @LoadBalanced
   @Bean
   public RestTemplate restTemplate() {
    return new RestTemplate();
   }
   public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
   }
	
}
