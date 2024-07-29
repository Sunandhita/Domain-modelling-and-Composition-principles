package com.exercise4.superclass_and_subclasses;

public class Person 
{
	private String name;
	private String address;
	
	public Person(String name, String address) 
	{
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() 
	{
		return name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String toString() 
	{
		return "Person [name=" + name + ", address=" + address + "]";
	}
}
