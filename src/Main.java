import Decorator.Burger;
import Decorator.Cheese;
import Decorator.Tomato;
import Facade.BurgerStoreFacade;
import Facade.Frier;
import Facade.Oven;
import Facade.Radio;
import Factory.BurgerFactory;
import Factory.BurgerStore;
import State.Waiter;
import Views.MenuViews;

import java.util.Scanner;

public class Main {

	public static BurgerStoreFacade initStoreComponent(){
		Oven oven=new Oven("Burger Store Oven");
		Frier frier=new Frier("Burger Store Frier");
		Radio radio=new Radio("Burger Store Radio");

		BurgerStoreFacade burgerStoreFacade=new BurgerStoreFacade(radio,oven,frier);
		return burgerStoreFacade;
	}

	public static void main(String[] args) {
		BurgerFactory burgerFactory = new BurgerFactory();
		BurgerStoreFacade burgerStoreFacade=initStoreComponent();
		BurgerStore store = new BurgerStore(burgerFactory, burgerStoreFacade);
		Waiter waiter = new Waiter(store);
		MenuViews.store(waiter);
		MenuViews.drawMenu(waiter);




//		Burger burger=store.orderBurger(2);
//		burger=new Cheese(burger);
//		burger=new Tomato(burger);
//		System.out.println(burger.cost());
//		System.out.println(burger.getDescription());

	}
}