package com.drools.example;

public class Person {
	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "location")
	private java.lang.String location;
	@org.kie.api.definition.type.Label(value = "age")
	private java.lang.Integer age;

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public Person(java.lang.String name, java.lang.String location,
			java.lang.Integer age) {
		this.name = name;
		this.location = location;
		this.age = age;
	}

}