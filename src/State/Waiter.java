package State;

import Factory.BurgerStore;

public class Waiter {
	State readyState;
	State getOrderState;
	State state;
	BurgerStore burgerStore;

	public Waiter(BurgerStore burgerStore) {
		readyState = new ReadyState(this);
		getOrderState = new GetOrderState(this);
		state = readyState;
		this.burgerStore=burgerStore;
	}

	public void getOrder() {
		state.getOrder();
	}

	public void printVoucher() {
		state.printVoucher();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getOrderState() {
		return getOrderState;
	}
}
