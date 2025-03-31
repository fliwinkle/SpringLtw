package com.example.demo.factory;

import org.springframework.stereotype.Component;

import com.example.demo.domain.FactoryDomain;
import com.example.demo.repo.FactoryRepo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DomainFactory {
	
		private final FactoryRepo factoryRepo;
		
		public FactoryDomain createEmptyDomain() {
			return new FactoryDomain(factoryRepo); 
		}
		//빌더 사용(권장)
		public FactoryDomain createDomain(String id) {
			return FactoryDomain.builder()
					.id(id)
					.factoryRepo(factoryRepo)
					.build();
					
		}
}
