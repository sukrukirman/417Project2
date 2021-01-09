package Decorator;

public class Tomato extends BurgerDecorator {

    public Tomato(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }
}
