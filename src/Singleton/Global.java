package Singleton;

public class Global {
	public void addOrder(String order) {
		Singleton.getInstance().addOrder(order);
	}

	public void printOrders() {
		Singleton.getInstance().printOrders();
	}
}
