package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Robot {

    void sayHello(URL url);

}
