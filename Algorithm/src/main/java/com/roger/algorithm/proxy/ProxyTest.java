package com.roger.algorithm.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        Hello hello = new HelloImpl();

        ProxyHandler handler = new ProxyHandler(hello);

        Hello proxyInstance = (Hello) Proxy.newProxyInstance(HelloImpl.class.getClassLoader(), hello.getClass().getInterfaces(), handler);

        proxyInstance.sayHi();

    }


}
