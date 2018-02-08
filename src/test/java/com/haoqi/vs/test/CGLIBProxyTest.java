package com.haoqi.vs.test;

import com.haoqi.vs.patterns.proxy.CGLIBDynamicProxy;
import com.haoqi.vs.patterns.proxy.ProxyObject;

public class CGLIBProxyTest {
	public static void main(String[] args) {
		ProxyObject proxy = CGLIBDynamicProxy.getInstance().getProxy(new ProxyObject().getClass());
		proxy.name();
		
		proxy.hashCode();
	}
}
