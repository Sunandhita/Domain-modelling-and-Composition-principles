package com.exercise4.superclass_and_subclasses;

//Test driver
public class TestMain 
{
	public static void main(String args[])
	{
		Student s1 = new Student("John","ABC Block xyz road", "BE",2023,100000);
		System.out.println(s1);
		System.out.println();
		
		Staff staff1 = new Staff("Prof. Paul","XYZ Block abc road", "New School", 60000);
		System.out.println(staff1);
	}
}
