package State;

import Views.MenuViews;

public class ReadyState implements State {
	Waiter waiter;

	public ReadyState(Waiter waiter) {
		this.waiter = waiter;
	}

	public void getOrder() {
		int burger_selection = MenuViews.getSelection();

		waiter.burgerStore.orderBurger(burger_selection);
		waiter.setState(waiter.getPreparingOrderState());
	}

	public void printVoucher() {
		System.out.println("You cannot ask for voucher because there is no order yet!");
	}
}
