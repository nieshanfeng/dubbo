package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

@Adaptive
public class AdaptiveRobot implements Robot {

    @Override
    public void sayHello(URL url) {
        System.out.println("标注在类上的自适应代理类，类名：" + this.getClass().getSimpleName());
    }

}
