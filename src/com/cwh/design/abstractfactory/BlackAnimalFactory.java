package com.cwh.design.abstractfactory;

public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat creatCat() {
		// TODO Auto-generated method stub
		return new BlackCat();
	}

	@Override
	public IDog creatDog() {
		// TODO Auto-generated method stub
		return new BlackDog();
	}

}
