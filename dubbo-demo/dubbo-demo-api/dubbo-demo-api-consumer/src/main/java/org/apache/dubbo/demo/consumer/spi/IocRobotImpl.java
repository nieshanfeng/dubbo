package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.URL;

public class IocRobotImpl implements Robot {

    private Robot robot;
    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sayHello(URL url) {
        System.out.println("ioc start");
        robot.sayHello(url);
    }
}
