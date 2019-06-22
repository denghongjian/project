package com.zr.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
    @RequestMapping(value = "/world")
    String world() {
    	return "Hello World!";
    }
    
}