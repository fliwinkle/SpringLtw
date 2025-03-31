package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.example.demo.repo.AopRepo;

@Configurable(autowire = Autowire.BY_TYPE)
public class AopDomain {
	@Autowired
	private AopRepo testrepo;
	
	
	public void testmethod() {
		System.out.println("testMethod");
		testrepo.test();
	}
}
