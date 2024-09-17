package com.wink.demo.spi;

import java.net.URL;

@SPI("logback")
public interface Log {

    void log(String log);

    @Adaptive(value = "log")
    void logAdaptive(URL url, String log);


}
