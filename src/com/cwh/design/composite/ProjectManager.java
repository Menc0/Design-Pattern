package com.cwh.design.composite;

import java.util.ArrayList;

public class ProjectManager extends Employer {

	
	public ProjectManager(String name) {
		setName(name);
		employers = new ArrayList();
	}

	@Override
	public void add(Employer employer) {
		employers.add(employer);

	}

	@Override
	public void delete(Employer employer) {
		employers.remove(employer);

	}

}
