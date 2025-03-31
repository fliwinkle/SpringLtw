package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.AopDomain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AopServiceImpl implements AopService{
	/*
	 * @configurable 어노테이션을 이용한 AOP 기반 주입
	 * domain 객체에 @configurable 어노테이션을 붙이면 객체 생성시점에 AOP에 의해 자동으로 주입
	 * domain 객체가 따로 관리되지 않는다.
	 * @configurable 작동을위해 별도 설정 필요 (config.AopConfig.java)
	 * 추가로 실행시 jvm에 -javaagent {path}/instrument-{version}.jar 설정 필요
	 * 
	 */  
	
	
	
	
	@Override
	public void testService() {
		// 테스트 도메인 생성 ( 빌더 패턴사용 가능 ) 
		AopDomain testDomain = new AopDomain();
		System.out.println(testDomain.hashCode());
		testDomain.testmethod();
	}
}
