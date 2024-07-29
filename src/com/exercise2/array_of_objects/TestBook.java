package com.exercise2.array_of_objects;

public class TestBook 
{
	public static void main(String args[])
	{
		Author[] authors = new Author[3];
		authors[0] = new Author("John", "john@abc.com", 'm');
		authors[1] = new Author("Paul", "paul@abc.com", 'm');
		authors[2] = new Author("Callie", "callie@abc.com", 'f');
		
		Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);
		System.out.println(); 
		
		System.out.println("name is: " + javaDummy.getName());
		System.out.println("price is: " + javaDummy.getPrice());
		System.out.println("qty is: " + javaDummy.getQty());
		System.out.println(); 
		
		System.out.println("Authors are: " + javaDummy.getAuthorNames());
	}
}
