package com.cwh.design.simplefactory;

public class Test {

	public static void main(String[] args){
		
		AnimalFactory factory = new AnimalFactory();
		Animal animal = factory.creatAnimal("cat");
		animal.eat();
		
		Animal animal1 = factory.creatAnimal("dog");
		animal1.eat();
		
	}
}
