import Facade.BurgerStoreFacade;
import Facade.Frier;
import Facade.Oven;
import Facade.Radio;
import Factory.BurgerFactory;
import Factory.BurgerStore;
import State.Waiter;
import Views.MenuViews;

public class Main {
	public static BurgerStoreFacade initStoreComponent(){
		Oven oven=new Oven("Burger Store Oven");
		Frier frier=new Frier("Burger Store Frier");
		Radio radio=new Radio("Burger Store Radio");

		BurgerStoreFacade burgerStoreFacade=new BurgerStoreFacade(radio,oven,frier);
		return burgerStoreFacade;
	}

	public static void main(String[] args) {
		// Create a burger factory
		BurgerFactory burgerFactory = new BurgerFactory();
		// Open the store
		BurgerStoreFacade burgerStoreFacade=initStoreComponent();
		BurgerStore store = new BurgerStore(burgerFactory, burgerStoreFacade);
		// Waiter can do only one job at a time
		Waiter waiter = new Waiter(store);
		MenuViews.store(waiter);
		MenuViews.drawMenu(waiter);
	}
}