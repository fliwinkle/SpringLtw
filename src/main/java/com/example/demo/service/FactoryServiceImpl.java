package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.FactoryDomain;
import com.example.demo.factory.DomainFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FactoryServiceImpl implements FactoryService{
	/*
	 * 팩토리 패턴 
	 * 팩토리 객체로 domain 객체를 생성하고 그 떄 repository를 직접 주입하는 방법
	 * 도메인 생성은 factory에서만 관리해야 한다.
	 * 개발자가 직접 팩토리 메소드를 만들고 repository를 주입해야 한다.
	 *  
	 */
	
	private final DomainFactory domainFactory;
	
	@Override
	public void testService() {
		FactoryDomain factoryDomain1 =  domainFactory.createEmptyDomain();
		FactoryDomain factoryDomain2 = domainFactory.createDomain("test");
		
		factoryDomain1.testmethod();
		factoryDomain2.testmethod();
		System.out.println("testService");
	}
}
