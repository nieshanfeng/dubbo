package org.apache.dubbo.servcie;

import java.util.concurrent.CountDownLatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("dubbo-provider.xml");
        applicationContext.start();

        new CountDownLatch(1).await();
    }
}
