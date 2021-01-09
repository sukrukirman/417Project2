import Decorator.Burger;
import Decorator.Cheese;
import Decorator.Tomato;
import Factory.BurgerFactory;
import Factory.BurgerStore;

import java.util.Scanner;

public class Main {
	public static int drawMenu() {
		Scanner scanner = new Scanner(System.in);
		int selection;
		do {
			System.out.println("1) Give order");
			System.out.println("2) See my order");
			System.out.println("3) Exit");
			System.out.println("Status: ON");
			System.out.print("Enter your selection: ");
			selection = scanner.nextInt();
		} while(selection < 1 || selection > 3);
		return selection;
	}

	public static void main(String[] args) {
//		int selection = drawMenu();

		BurgerFactory burgerFactory=new BurgerFactory();
		BurgerStore store=new BurgerStore(burgerFactory);

		Burger burger=store.orderBurger("Cheese Burger");
		burger=new Cheese(burger);//additionla cheese
		burger=new Tomato(burger);//additional tomato
		System.out.println(burger.cost());
		System.out.println(burger.getDescription());


	}
}