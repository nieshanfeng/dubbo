package com.wink.demo.spi.wrapper;

import org.apache.dubbo.common.URL;

import com.wink.demo.spi.Log;

public class LogWrapper2 implements Log {
    private Log logger;

    public LogWrapper2(Log log) {
        this.logger = log;
    }

    @Override
    public void log(String log) {
        System.out.println("fdsfsdfdsfs");
        logger.log(log+"wrapper");
        System.out.println("aaa");
    }

    @Override
    public void logAdaptive(URL url, String log) {
        logger.log(log+"wrapper");
    }
}
