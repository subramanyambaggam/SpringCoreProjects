package com.nt.beans;

import java.util.Set;

public class UserForSet {
	//bean properties

private Set<String> phones;

//injecting properties through setter methods i.e. setter injection

public void setPhones(Set<String> phones) {
	this.phones = phones;
}

//to string method to display object data in string array format
@Override
public String toString() {
	return "UserForSet [phones=" + phones + "]";
}
}
