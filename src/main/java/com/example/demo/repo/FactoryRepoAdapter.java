package com.example.demo.repo;

import org.springframework.stereotype.Repository;

@Repository
public class FactoryRepoAdapter implements FactoryRepo {

	@Override
	public void test() {
		System.out.println("factoryRepo");
	}
}
