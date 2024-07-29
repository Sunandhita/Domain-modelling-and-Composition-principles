package com.exercise1.author_and_book_classes;

public class Author 
{
	private String name;
	private String email;
	private char gender; //We can use enum as well, for gender, as gender takes values of 'm' and 'f' only
	
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
}
