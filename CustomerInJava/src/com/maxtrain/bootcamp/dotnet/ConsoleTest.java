package com.maxtrain.bootcamp.dotnet;

import java.util.ArrayList;

public class ConsoleTest {

	public static void main(String[] args) {

		Customer customer = new Customer("Perker's Special Clothing Store");
		
		System.out.println(customer.getSales());
		
		try {
			customer.addSales(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.isNationalAcct());
		System.out.println(customer.getSales());
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer customer2 = new Customer("Lulu's Rice & Noodle");
		Customer customer3 = new Customer("Target");
		
		customers.add(customer);
		customers.add(customer2);
		customers.add(customer3);
		
		for(Customer c : customers) {
			String message = String.format("%d | %s | %f", c.getId(), c.getName(), c.getSales());
			System.out.println(message);
		}
		
	}

}
