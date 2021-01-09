import Decorator.Burger;
import Decorator.Cheese;
import Decorator.Tomato;
import Factory.BurgerFactory;
import Factory.BurgerStore;
import State.Waiter;

import java.util.Scanner;

public class Main {
	public static int drawMenu(Waiter waiter) {
		Scanner scanner = new Scanner(System.in);
		int selection;
		do {
			System.out.println("1) Give order");
			System.out.println("2) Print my voucher");
			System.out.println("3) Exit");
			System.out.print("Enter your selection: ");
			selection = scanner.nextInt();
		} while(selection < 1 || selection > 3);
		if(selection == 1) waiter.getOrder();
		else System.exit(0);

		return selection;
	}

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		drawMenu(waiter);

		BurgerFactory burgerFactory=new BurgerFactory();
		BurgerStore store=new BurgerStore(burgerFactory);

		Burger burger=store.orderBurger("Cheese Burger");
		burger=new Cheese(burger);
		burger=new Tomato(burger);
		System.out.println(burger.cost());
		System.out.println(burger.getDescription());

	}
}