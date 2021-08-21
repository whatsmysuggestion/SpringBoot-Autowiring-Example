package com.example.demo;

import org.springframework.stereotype.Service;

@Service("s2")
public class Service2 implements Addition {

	@Override
	public int add(int a, int b) {
		 return a+b;
	}

}
