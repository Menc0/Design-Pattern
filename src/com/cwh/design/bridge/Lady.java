package com.cwh.design.bridge;

public class Lady extends Person {

	public Lady() {
        setType("Ů��");
    }
    
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
