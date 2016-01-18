package com.ceair.dubboconsumer.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ceair.dubbo.service.DemoService;

public class Consumer {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
 
        DemoService demoService = (DemoService)context.getBean("demoService"); // ��ȡԶ�̷������
        String hello = demoService.sayHello("world"); // ִ��Զ�̷���
 
        System.out.println( hello ); // ��ʾ���ý��
    }
}
