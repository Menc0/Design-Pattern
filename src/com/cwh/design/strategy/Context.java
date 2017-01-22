package com.cwh.design.strategy;

public class Context {

	private Strategy str;

	public Context(Strategy str) {
		super();
		this.str = str;
	}
	
	public void doMethod(){
		str.doMethod();
	}
}
