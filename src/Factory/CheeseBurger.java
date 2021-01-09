package Factory;

import Decorator.Burger;

public class CheeseBurger extends Burger {

    public CheeseBurger() {
        name="Cheese Burger";
        desc="Cheese Burger";
    }

    @Override
    public double cost() {
        return 12.99;
    }
}
