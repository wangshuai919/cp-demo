package com.ciccwm.cpdemo.servant;

import com.qq.tars.protocol.annotation.Servant;
import com.qq.tars.protocol.tars.annotation.TarsMethodParameter;

@Servant
public interface HelloServant {
    String hello(@TarsMethodParameter(name="no")int no, @TarsMethodParameter(name="name")String name);
}
