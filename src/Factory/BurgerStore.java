package Factory;

import Decorator.Burger;

public class BurgerStore {
    public BurgerFactory burgerFactory;

    public BurgerStore(BurgerFactory burgerFactory) {
        this.burgerFactory = burgerFactory;
    }

    public Burger orderBurger(int type){
        Burger burger;
        burger=burgerFactory.createBurger(type);

        burger.prepare();
        burger.box();

        return burger;
    }
}
