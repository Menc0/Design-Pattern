package com.cwh.design.proxy;

public class ObjectImpl implements Object{

	@Override
	public void action() {
		System.out.println("===被代理对象===");
	}

}
