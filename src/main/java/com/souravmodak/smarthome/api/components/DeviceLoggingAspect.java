package com.souravmodak.smarthome.api.components;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DeviceLoggingAspect {

    @Pointcut("execution(* com.souravmodak.smarthome.api.service.DeviceService.toggleDevice(..))")
    public void deviceTogglePointcut() {}

    @After("deviceTogglePointcut()")
    public void logDeviceStatusChange() {
        System.out.println("Device status has been toggled.");
    }
}
