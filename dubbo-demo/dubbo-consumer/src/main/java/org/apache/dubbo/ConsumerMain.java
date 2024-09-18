package org.apache.dubbo;

import org.apache.dubbo.api.service.UserService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        applicationContext.start();
        UserService userService = (UserService) applicationContext.getBean( "userService");
        boolean ret = userService.login(  "xiaohei", "123456");
        System.out.println("ret="+ret);
        System.in.read();

    }
}
