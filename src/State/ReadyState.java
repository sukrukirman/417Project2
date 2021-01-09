package State;

import Views.MenuViews;

public class ReadyState implements State {
	Waiter waiter;

	public ReadyState(Waiter waiter) {
		this.waiter = waiter;
	}

	public void getOrder() {
		MenuViews.getSelection();
		waiter.setState(waiter.getOrderState());
	}

	public void printVoucher() {
		System.out.println("You cannot ask for voucher because there is no order yet!");
	}
}
