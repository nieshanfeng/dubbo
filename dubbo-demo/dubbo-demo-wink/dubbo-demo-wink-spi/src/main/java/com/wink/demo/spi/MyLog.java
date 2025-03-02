package com.wink.demo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;

@Activate(group = "my",order = 1)
public class MyLog  implements Log {

    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public void log(String log) {
        System.out.println("my log:"+log);
       /* URL url = URL.valueOf("test://localhost/test?service=common");
        service.sayHello(url);*/
    }

    @Override
    public void logAdaptive(URL url, String log) {
        System.out.println("my log logAdaptive:"+log);
    }
}
