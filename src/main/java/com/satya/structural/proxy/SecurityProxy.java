package com.satya.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler
{

    private Object obj;

    public SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstace(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().toUpperCase().contains("POST")){
            throw new RuntimeException("not allowed");
        }
            Object result = method.invoke(obj,args);
        try{
            result = method.invoke(obj,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }catch ( Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
