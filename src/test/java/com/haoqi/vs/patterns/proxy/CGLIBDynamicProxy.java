package com.haoqi.vs.patterns.proxy;

import java.lang.reflect.Method;

import javax.management.InstanceAlreadyExistsException;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLIB动态代理
 * @author zhengxiao.su
 * @date 2018-02-02 9:00:00
 */
public class CGLIBDynamicProxy implements MethodInterceptor{
	private static CGLIBDynamicProxy instance = new CGLIBDynamicProxy();
	
	/*
	 * 单例模式
	 */
	private CGLIBDynamicProxy() {}
	
	public static CGLIBDynamicProxy getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public <T> T getProxy(Class<T> clazz) {
		return (T) Enhancer.create(clazz, this);
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		before();
		Object result = proxy.invokeSuper(obj, args);
		after();
		return result;
	}

	public void before() {
		System.err.println("等等，作为代理我开路！");
	}
	
	public void after() {
		System.err.println("等等，作为代理我断后！");
	}
}
