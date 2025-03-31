package com.example.demo.repo;

import org.springframework.stereotype.Repository;

@Repository
public class AopRepoAdapter implements AopRepo {

	@Override
	public void test() {
		System.out.println("testRepo");
	}
}
