package Decorator;

public abstract class Burger {
    public String name;
    public String desc="";

    public String getDescription() {
        return desc;
    }

    public abstract double cost();

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}
