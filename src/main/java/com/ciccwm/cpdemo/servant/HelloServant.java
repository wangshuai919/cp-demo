package com.ciccwm.cpdemo.servant;

import com.qq.tars.protocol.annotation.Servant;

@Servant
public interface HelloServant {
    public String hello(int no, String name);
}
