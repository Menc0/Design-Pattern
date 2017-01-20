package com.cwh.design.factorymethod;

public class DogEatFactory implements IEatFactory{

	@Override
	public Eat getEat() {
		// TODO Auto-generated method stub
		return new DogEat();
	}

	
}
