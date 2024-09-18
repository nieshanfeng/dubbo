package com.wink.demo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestSpiDubbo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            ExtensionLoader<Log> extensionLoader = ExtensionLoader.getExtensionLoader(Log.class);
            extensionLoader.getExtension("logback").log("hello world");
            //extensionLoader.getExtension("log4j").log("hello world");
            extensionLoader.getExtension("log4j").log("hello world");
            //extensionLoader.getExtension("mylog").log("hello world");
        }
    }
}
