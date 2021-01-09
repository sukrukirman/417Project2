package Decorator;

public class MeetBall extends BurgerDecorator{

    public MeetBall(Burger burger) {
        this.burger=burger;
    }

    @Override
    public double cost() {
        return burger.cost()+2;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ ", 100gr meat";
    }
}
