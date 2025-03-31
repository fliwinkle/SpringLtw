package com.example.demo.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

import com.example.demo.domain.PrototypeBeanDomain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PrototypeBeanServiceImpl implements PrototypeService{
	/*
	 * 스프링 빈 Prototype Scope 활용한 도메인 객체 관리
	 * 스프링에서 도메인 객체를 싱글톤 형태가 아닌 프로토타입으로 관리
	 * 싱글톤과 달리 매번 새로운 객체롤 생성하며 생성까지만 스프링에서 관리한다.
	 *  
	 *  
	 */
	private final ObjectProvider<PrototypeBeanDomain> PrototypeBeanDomainProvider;
	
	@Override
	public void testService() {
		//객체를 스프링에서 받아옴
		PrototypeBeanDomain prototypeBeanDomain= PrototypeBeanDomainProvider.getObject();
		prototypeBeanDomain.testmethod();
		
		System.out.println(prototypeBeanDomain.hashCode());
		System.out.println("testService");
	}
}
