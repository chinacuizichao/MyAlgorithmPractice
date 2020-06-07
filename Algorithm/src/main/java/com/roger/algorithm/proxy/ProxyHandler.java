package com.roger.algorithm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Proxy work!!");
        return target;
    }
}
