package com.maxtrain.bootcamp.dotnet;

public class Customer {
	
	private int _id;
	private String _name;
	private boolean _nationalAcct;
	private double _sales;
	
	private static int nextId = 1;
	
	public int getId() {
		return _id;
	}
	private void setId(int id) {
		_id = id;
	}
	
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	
	public boolean isNationalAcct() {
		return _nationalAcct;
	}
	public void setNationalAcct(boolean isNationalAcct) {
		_nationalAcct = isNationalAcct;
	}
	
	public double getSales() {
		return _sales;
	}
	public void setSales(double sales) {
		_sales = sales;
	}

	
	public Customer(String name, boolean isNationalAcct, double sales) {
		setId(nextId++);
		setName(name);
		setNationalAcct(isNationalAcct);
		setSales(sales);
	}
	public Customer(String name, boolean isNationalAcct) {
		this(name, isNationalAcct, 0);
	}
	public Customer(String name) {
		this(name, false);
	}
	public Customer() {
		this(null);
	}
	
	public void addSales(double amount) throws Exception { // you must declare potential exceptions...
		if(amount <= 0) {
			throw new Exception("Sales amount must be greater than 0.");
		}
		setSales(getSales() + amount);
	}
	public void applyCredit(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Credit amount must be greater than 0.");
		}
		setSales(getSales() - amount);
	}
	
}
