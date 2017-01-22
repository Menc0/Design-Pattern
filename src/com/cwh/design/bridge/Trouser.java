package com.cwh.design.bridge;

public class Trouser implements Clothing {

	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getType() + "´©¿ã×Ó");

	}

}
