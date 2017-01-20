package com.cwh.design.simplefactory;

public class AnimalFactory {

	public Animal creatAnimal(String type){
		if("cat".equals(type)){
			return new Cat();
		}
		else if("dog".equals(type)){
			return new Dog();
		}else{
			return null;
		}
		
	}
}
