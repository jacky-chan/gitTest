package com.ceair.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
 
        System.in.read(); // 按任意键退出    
		//System.out.println(Provider.class.getClassLoader().getResource("")); 
	}
}
