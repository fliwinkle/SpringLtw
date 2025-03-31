package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.AopDomain;
import com.example.demo.service.AopService;
import com.example.demo.service.AopServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aop")
public class AopController {
	
	private final AopService aopService;
	
	@GetMapping("test")
	public String testapi() {
		aopService.testService();
		return "test";
	}

}
