package com.payment.gateway;


public class Payment {
	
	private int userId;
	private String name;
	 private double amount;
	public Payment(String name, int userId, double amount) {
		this.name=name;
		this.userId=userId;
		this.amount=amount;
		}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}
