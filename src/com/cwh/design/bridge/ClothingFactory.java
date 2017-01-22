package com.cwh.design.bridge;

public class ClothingFactory {

	private static Clothing clothing;

	public static Clothing getClothing() {
		return clothing;
	}

	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}
	
}
