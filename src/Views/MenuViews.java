package Views;

import State.Waiter;

import java.util.Scanner;

public class MenuViews {

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
		else if(selection == 2) waiter.printVoucher();
		else System.exit(0);

		return selection;
	}

	public static int getSelection() {
		Scanner scanner = new Scanner(System.in);
		int selection;
		do {
			System.out.println("***MENU***");
			System.out.println("1) Vegan Burger");
			System.out.println("2) Cheese Burger");
			System.out.println("3) Fish Burger");
			System.out.print("Enter selection: ");
			selection = scanner.nextInt();
		} while(selection < 1 || selection > 3);
		return selection;
	}

	public static int addAdditional() {
		Scanner scanner = new Scanner(System.in);
		int selection;
		do {
			System.out.println("Do you want additional ingredient?");
			System.out.println("1) Add tomato");
			System.out.println("2) Add cheese");
			System.out.println("3) I don't want to add additional ingredient");
			System.out.print("Enter selection: ");
			selection = scanner.nextInt();
		} while(selection < 1 || selection > 3);
		return selection;
	}

	public static int store(Waiter waiter){
		Scanner scanner = new Scanner(System.in);
		int selection;
		do {
			System.out.println("1) Open Store");
			System.out.println("2) Close Store");
			System.out.print("Enter selection: ");
			selection = scanner.nextInt();
		} while(selection < 1 || selection > 2);
		if(selection == 1) waiter.getBurgerStore().burgerStoreFacade.openStore();
		else if(selection == 2){
			waiter.getBurgerStore().burgerStoreFacade.closeStore();
			System.exit(0);
		}
		return selection;
	}
}