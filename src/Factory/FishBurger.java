package Factory;

import Decorator.Burger;

public class FishBurger extends Burger {

    public FishBurger() {
        name="Fish Burger";
        desc="Fish Burger";
    }

    @Override
    public double cost() {
        return 11.99;
    }
}
