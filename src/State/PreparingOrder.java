package State;

public class PreparingOrder implements State {
	Waiter waiter;

	PreparingOrder(Waiter waiter) {
		this.waiter = waiter;
	}

	public void getOrder() {
		System.out.println("You cannot give order because we are still preparing the orders!");
	}

	public void printVoucher() {
		System.out.println("Printing voucher");
		waiter.setState(waiter.getReadyState());
	}

}
