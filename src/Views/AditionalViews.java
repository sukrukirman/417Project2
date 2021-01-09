package Views;

import java.util.Scanner;

public class AditionalViews {
	public static boolean needCheese() {
		Scanner scanner = new Scanner(System.in);

		String selection_str;

		do {
			System.out.print("Do you need cheese (Y/N):");
			selection_str = scanner.next();
		} while(!selection_str.equals("Y") && !selection_str.equals("N"));

		if(selection_str.equals("Y")) return true;
		else return false;
	}

	public static boolean needCoke() {
		Scanner scanner = new Scanner(System.in);

		String selection_str;

		do {
			System.out.print("Do you need coke (Y/N):");
			selection_str = scanner.next();
		} while(!selection_str.equals("Y") && !selection_str.equals("N"));

		if(selection_str.equals("Y")) return true;
		else return false;
	}

	public static boolean needTomato() {
		Scanner scanner = new Scanner(System.in);

		String selection_str;

		do {
			System.out.print("Do you need tomato (Y/N):");
			selection_str = scanner.next();
		} while(!selection_str.equals("Y") && !selection_str.equals("N"));

		if(selection_str.equals("Y")) return true;
		else return false;
	}
}
