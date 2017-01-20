package com.cwh.design.factorymethod;


public class CatEatFactory implements IEatFactory {

	@Override
	public Eat getEat() {
		// TODO Auto-generated method stub
		return new CatEat();
	}

}
