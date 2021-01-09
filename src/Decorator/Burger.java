package Decorator;

public abstract class Burger {
    public String name;
    public String desc="";

    public String getDescription() {
        return desc;
    }

    public abstract double cost();

    public void prepare() {
        System.out.println("Preparing " + getDescription());
        for(int i=0;i<=100;i=i+10){
            try {
                Thread.sleep(250);
                System.out.print(i+"%--");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
    }

    public void box() {
        System.out.println("Boxing " + getDescription());
    }
}
