package Factory;

import Decorator.Burger;
import Facade.BurgerStoreFacade;

public class BurgerStore {
    public BurgerFactory burgerFactory;
    public BurgerStoreFacade burgerStoreFacade;

    public BurgerStore(BurgerFactory burgerFactory, BurgerStoreFacade burgerStoreFacade) {
        this.burgerFactory = burgerFactory;
        this.burgerStoreFacade = burgerStoreFacade;
    }

    public Burger orderBurger(Burger burger) {
        burger.prepare();
        burger.box();
        return burger;
    }

    public Burger addIngredient(int type, Burger burger) {
       burger=burgerFactory.addIngredient(type,burger);
       return burger;
    }

    public Burger createBurger(int type) {
        Burger burger;
        burger = burgerFactory.createBurger(type);
        return burger;
    }
}
