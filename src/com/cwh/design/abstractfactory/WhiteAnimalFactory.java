package com.cwh.design.abstractfactory;

public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public ICat creatCat() {
		// TODO Auto-generated method stub
		return new WhiteCat();
	}

	@Override
	public IDog creatDog() {
		// TODO Auto-generated method stub
		return new WhiteDog();
	}

}
