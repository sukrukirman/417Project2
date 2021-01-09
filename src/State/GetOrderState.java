package State;

public class GetOrderState implements State {
	Waiter waiter;

	public GetOrderState(Waiter waiter) {
		this.waiter = waiter;
	}

	public void getOrder() {
		System.out.println("I cannot get order since your are already ordering!");
	}

	public void askVoucher() {

	}
}
