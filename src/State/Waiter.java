package State;

import Factory.BurgerStore;

public class Waiter {
	State readyState;
	State preparingOrderState;
	State state;
	BurgerStore burgerStore;

	public Waiter(BurgerStore burgerStore) {
		readyState = new ReadyState(this);
		preparingOrderState = new PreparingOrder(this);
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

	public State getPreparingOrderState() {
		return preparingOrderState;
	}
}
