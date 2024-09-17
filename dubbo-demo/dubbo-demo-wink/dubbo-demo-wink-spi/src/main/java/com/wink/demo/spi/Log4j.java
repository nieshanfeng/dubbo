package com.wink.demo.spi;

import java.net.URL;

public class Log4j implements Log{
    @Override
    public void log(String log) {
        System.out.println("log4j print " + log + " this is " + this);
    }

    @Override
    public void logAdaptive(URL url, String log) {
        System.out.println("logAdaptive log4j print " + log + " this is " + this);
    }
}
