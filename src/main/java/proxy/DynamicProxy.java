package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object subject;

    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        System.out.println("\r\nMethod:" + method);
        System.out.println("before invoke method " + method.getName());
        method.invoke(subject, args);
        System.out.println("after invoke method " + method.getName());
        return null;
    }
}
