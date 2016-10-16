package main.java.hello;

import java.util.Date;

public class Expense {

	private final double amount;
	private final String category;
	private final Date date;

	public Expense(double amount, String category, Date date) {
		this.amount = amount;
		this.category = category;
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public String getCategory() {
		return category;
	}

	public Date getDate() {
		return date;
	}
}