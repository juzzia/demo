package com.git.simulate;

import java.lang.reflect.Method;

public interface InvocationHandler {


    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable;


}
