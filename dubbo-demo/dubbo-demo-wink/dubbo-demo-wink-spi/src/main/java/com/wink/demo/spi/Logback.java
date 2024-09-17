package com.wink.demo.spi;

import java.net.URL;

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
