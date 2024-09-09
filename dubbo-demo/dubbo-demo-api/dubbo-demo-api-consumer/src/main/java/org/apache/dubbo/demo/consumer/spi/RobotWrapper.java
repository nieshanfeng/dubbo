package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;

public class RobotWrapper  implements Robot {
    private Robot robot;

    // 带Robot参数的构造方法，这是包装类的重点
    public RobotWrapper(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sayHello(URL url) {
        System.out.println("wrapper before...");
        this.robot.sayHello(url);
        System.out.println("wrapper after...");
    }
}
