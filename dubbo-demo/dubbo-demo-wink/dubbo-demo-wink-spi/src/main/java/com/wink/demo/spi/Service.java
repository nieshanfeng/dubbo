package com.wink.demo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Service {

    void sayHello(URL url);
}
