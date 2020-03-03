package com.maxtrain.bootcamp.dotnet;

public class UsCustomer extends Customer {

	
	public UsCustomer(String name, double sales) {
		super(name, false, sales);
		//setName(name);
		//setNationalAcct(false);
		//setSales(sales);
	}
	public UsCustomer(String name) {
		this(name, 0);
	}
	public UsCustomer() {
		this(null);
	}
	
}
