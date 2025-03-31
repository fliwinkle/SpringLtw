package com.example.demo.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.repo.AopRepo;

import lombok.RequiredArgsConstructor;

@Component @Scope( "prototype")
@RequiredArgsConstructor
public class PrototypeBeanDomain {
	private final AopRepo testrepo;
	
	
	public void testmethod() {
		System.out.println("testMethod");
		testrepo.test();
	}
}
