package com.wink.demo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

import org.junit.jupiter.api.Test;

public class DubboSpiDefaultExtTest {

    @Test
    void testDefaultExt(){
        for (int i = 0; i < 3; i++) {
            ExtensionLoader<Log> extensionLoader = ExtensionLoader.getExtensionLoader(Log.class);
            extensionLoader.getDefaultExtension().log("hello world");
        }
    }

}
