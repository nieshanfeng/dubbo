package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Test {
    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot robot = extensionLoader.getExtension("iocRobot");
        robot.sayHello(null);
    }
}
