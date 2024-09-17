package com.wink.demo.spi;

import java.util.ServiceLoader;

public class TestSpi {

    public static void main(String[] args) {
        // ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        for (int i = 0; i < 3; i++) {
            ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
            for (Log next : serviceLoader) {
                next.log("hello world");
            }
        }
    }
}
