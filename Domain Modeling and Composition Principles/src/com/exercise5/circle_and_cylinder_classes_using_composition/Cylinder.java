package com.exercise5.circle_and_cylinder_classes_using_composition;

public class Cylinder 
{
	private Circle base;
	private double height;
	
	public Cylinder() 
	{
		base = new Circle(10,"blue");
		height = 1.0;
	}

	public Circle getBase() 
	{
		return base;
	}

	public void setBase(Circle base) 
	{
		this.base = base;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}
}
