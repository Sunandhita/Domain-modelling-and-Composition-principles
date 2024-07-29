package com.exercise5.circle_and_cylinder_classes_using_composition;

public class Circle 
{
	private double radius;
	private String colour;
	
	public Circle() {
		super();
	}

	public Circle(double radius, String colour) 
	{
		super();
		this.radius = radius;
		this.colour = colour;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
}
