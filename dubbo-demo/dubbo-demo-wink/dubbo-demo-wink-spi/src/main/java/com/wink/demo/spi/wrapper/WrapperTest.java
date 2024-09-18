package com.wink.demo.spi.wrapper;

import org.apache.dubbo.common.extension.ExtensionLoader;

import com.wink.demo.spi.Log;

public class WrapperTest {
    public static void main(String[] args) {
        ExtensionLoader<Log> extensionLoader = ExtensionLoader.getExtensionLoader(Log.class);
        Log logback = extensionLoader.getExtension("logback");
        logback.log("hello world");
        Log log4j = extensionLoader.getExtension("log4j");
        log4j.log("hello world");
    }
}
