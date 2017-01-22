package com.cwh.design.singleton;

public class Test {

	public static void main(String []args){
		Singleton sing1 = Singleton.getInstants();
		Singleton sing2 = Singleton.getInstants();
		System.out.println(sing1);
		System.out.println(sing2);
	}
}
