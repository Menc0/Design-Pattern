package com.cwh.design.composite;

public class Programmer extends Employer {
	

	public Programmer(String name) {
		setName(name);
		employers = null;////程序员, 表示没有下属了
	}

	@Override
	public void add(Employer employer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Employer employer) {
		// TODO Auto-generated method stub

	}

}
