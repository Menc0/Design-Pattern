package com.cwh.design.bridge;

public class Jacket implements Clothing {

	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getType() + "´©Âí¼×");

	}

}
