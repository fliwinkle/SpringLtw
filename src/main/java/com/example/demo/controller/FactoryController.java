package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.FactoryService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/factory")
public class FactoryController {
	
	private final FactoryService FactoryService;	
	
	@GetMapping("test")
	public String testapi() {
		FactoryService.testService();
		return "test";
	}

}
