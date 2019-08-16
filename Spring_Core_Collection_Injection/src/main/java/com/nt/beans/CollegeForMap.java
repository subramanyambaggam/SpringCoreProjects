package com.nt.beans;

import java.util.Map;

public class CollegeForMap {

//bean properties
private Map<String,String> facultySubjects;

	
//injecting bean properties through constructor i.e. constructor injection
public CollegeForMap(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}
	
//to string method to display object data in string array format
	@Override
	public String toString() {
		return "CollegeForMap [facultySubjects=" + facultySubjects + "]";
	}

}
