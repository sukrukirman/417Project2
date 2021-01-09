package State;

public class Waiter {
	State readyState;
	State getOrderState;

	State state;

	public Waiter() {
		readyState = new ReadyState(this);
		getOrderState = new GetOrderState(this);
		state = readyState;
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
