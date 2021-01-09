package Factory;

import Decorator.Burger;

public class VeganBurger extends Burger {

    public VeganBurger() {
        desc="Vegan Burger";
        name="Vegan Burger";
    }

    @Override
    public double cost() {
        return 14.99;
    }
}
