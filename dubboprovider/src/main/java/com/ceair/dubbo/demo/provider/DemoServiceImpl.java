package com.ceair.dubbo.demo.provider;

import com.ceair.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name ;
	}

}
