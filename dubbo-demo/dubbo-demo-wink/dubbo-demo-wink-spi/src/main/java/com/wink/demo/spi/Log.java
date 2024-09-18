package com.wink.demo.spi;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

import org.apache.dubbo.common.URL;

@SPI("logback")
public interface Log {

    void log(String log);

    @Adaptive(value = "log")
    void logAdaptive(URL url, String log);


}
