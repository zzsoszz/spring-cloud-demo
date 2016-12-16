package com.qingtian.consumerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;


@RestController
public class ConsumerController {
	
	@Autowired
	private EurekaClient discoveryClient;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@RequestMapping("/consumer")
    public String home() {
		System.out.println("consumer");
		try{
			return this.restTemplate.getForObject("http://microservice-provider-user/provider", String.class);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return "consumer";
    }
	
	
}
