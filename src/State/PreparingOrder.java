package State;

import Decorator.Burger;

public class PreparingOrder implements State {
	Waiter waiter;

	PreparingOrder(Waiter waiter) {
		this.waiter = waiter;
	}

	public void getOrder() {
		System.out.println("You cannot give order because we are still preparing the orders!");
		System.out.println("You need to take your voucher and we will be ready for next order!");
	}

	public void printVoucher() {
		System.out.println("Printing voucher");
		Burger burger=waiter.burgerStore.getOrderList().get(waiter.burgerStore.getOrderList().size()-1);
		System.out.println("Total Cost is:" +burger.cost()+"$ for "+burger.getDescription());
		waiter.setState(waiter.getReadyState());
	}

	@Override
	public String toString() {
		return "Preparing Order State";
	}
}
