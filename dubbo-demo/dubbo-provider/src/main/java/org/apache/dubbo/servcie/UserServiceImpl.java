package org.apache.dubbo.servcie;

import org.apache.dubbo.api.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String name, String password) {
        System.out.println("UserServiceImpl.login name " + name + " password " + password);
        return false;
    }
}
