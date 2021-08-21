package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*@Primary*/
@Service("s1")
public class Service1 implements Addition
{

	@Override
	public int add(int a, int b) {
	return a+b;
	}

}
