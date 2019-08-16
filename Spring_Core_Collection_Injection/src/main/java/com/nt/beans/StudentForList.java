package com.nt.beans;

import java.util.Arrays;
import java.util.List;

public class StudentForList {
//bean properties
	private int[] marks;
	private List<String> names;
//injecting properties through setter methods i.e. setter injection
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

//to string method to display object data in string array format
@Override
	public String toString() {
		return "StudentForList [marks=" + Arrays.toString(marks) + ", names=" + names + "]";
	}

public List<String> getNames() {
	return names;
}

}
