package com.wink.demo.spi;

import org.apache.dubbo.common.extension.Activate;

import org.apache.dubbo.common.URL;

@Activate(group = "common",order = 3)
public class Logback implements Log{

    @Override
    public void log(String log) {
        System.out.println("Logback print " + log +" this is "+ this);
    }

    @Override
    public void logAdaptive(URL url, String log) {
        System.out.println("logAdaptive Logback print " + log +" this is "+ this);
    }

}
