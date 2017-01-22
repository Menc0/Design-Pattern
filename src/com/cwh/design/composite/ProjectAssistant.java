package com.cwh.design.composite;

public class ProjectAssistant extends Employer {

	
	public ProjectAssistant(String name) {
		setName(name);
		employers = null;//项目助理没有下属
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
