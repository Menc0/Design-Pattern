package com.cwh.design.adapter;

public class Adapter implements Target{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void adapteeMethod() {
		adaptee.adapteeMethod();
		
	}

	@Override
	public void adapterMethod() {
		System.out.println("===adapterMethod====");
		
	}

}
