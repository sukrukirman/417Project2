package Views;

import java.util.Scanner;

public class MenuViews {
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
}