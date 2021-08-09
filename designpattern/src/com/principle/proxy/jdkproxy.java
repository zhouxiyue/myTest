package com.principle.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class jdkproxy {
    public static void main(String[] args) {
        impl1 impl = new impl1();
        interface1 in = (interface1) Proxy.newProxyInstance(
                impl.getClass().getClassLoader(),
                impl.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("proxy");
                        Object o=method.invoke(impl);
                        System.out.println("finish");
                        return o;
                    }
                });
        in.hello();
    }
}
