package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.AopDomain;
import com.example.demo.repo.AopRepo;
import com.example.demo.service.PrototypeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prototype")
public class PrototypeBeanTestController {
	
	private final PrototypeService prototypeBeanService;	
	@GetMapping("test")
	public String testapi() {
		prototypeBeanService.testService();
		return "test";
	}

}
