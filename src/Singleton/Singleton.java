package Singleton;

import java.util.ArrayList;

public class Singleton {
	private static Singleton instance;
	private ArrayList<String> orders = new ArrayList<String>();

	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		return instance;
	}

	public void addOrder(String order) {
		orders.add(order);
	}

	public void printOrders() {
		for(String order: orders) {
			System.out.println(order);
		}
	}
}
