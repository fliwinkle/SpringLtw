package com.example.demo.repo;

import org.springframework.stereotype.Repository;

@Repository
public class PrototypeBeanRepoAdapter implements PrototypeBeanRepo {

	@Override
	public void test() {
		System.out.println("PrototypeBeanRepo");
	}
}
