package com.qingtian.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProviderController {
	
	@RequestMapping("/testhome")
    public String home() {
        return "Hello world";
    }
	
}
