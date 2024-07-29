package com.exercise3.customer_and_invoice_classes;

public class Invoice 
{
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) 
	{
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerId()
	{
		return customer.getId();
	}
	
	public String getCustomerName()
	{
		return customer.getName();
	}
	
	public int getCustomerDiscount()
	{
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount()
	{
		double amountAfterDisount = amount - ((amount * getCustomerDiscount())/100);
		
		return amountAfterDisount;
	}

	@Override
	public String toString() 
	{
		return "Invoice [id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
	}
}
