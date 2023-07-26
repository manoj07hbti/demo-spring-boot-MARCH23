package com.example.demospringboot.controller;

import com.example.demospringboot.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

@Autowired
AppService service;

@GetMapping("/app_flow")
public String demoEndpoint(){
return service.demoService();
}
}
