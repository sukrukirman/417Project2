package Decorator;

public class Cheese extends BurgerDecorator{

    public Cheese(Burger burger) {
        this.burger=burger;
    }

    @Override
    public double cost() {
        return burger.cost()+1;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+", Cheese";
    }
}
