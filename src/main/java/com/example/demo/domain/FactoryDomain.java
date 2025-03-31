package com.example.demo.domain;

import com.example.demo.repo.FactoryRepo;

import lombok.Builder;
import lombok.Getter;

@Getter
public class FactoryDomain {
	private String id ;
	private String column;
	
	//
	private final FactoryRepo factoryRepo;
	
	// 팩토리 생성 위한 생성자 type 1 
	public FactoryDomain(FactoryRepo factoryRepo) {
		super();
		this.factoryRepo = factoryRepo;
	}
	// 빌더를 이용한 생성 type 2 
	@Builder
	public FactoryDomain(String id, String column ,FactoryRepo factoryRepo) {
		super();
		this.factoryRepo = factoryRepo;
		this.id = id;
		this.column = column;
	}
	
	public void testmethod() {
		System.out.println("testMethod");
		System.out.println("id == " + id );
		factoryRepo.test();
	}
}
