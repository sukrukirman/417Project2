package Factory;

import Decorator.Burger;
import Decorator.Cheese;

public class BurgerFactory {

    public Burger createBurger(String type){
        Burger burger=null;

        if(type.equals("Vegan")){
            burger=new VeganBurger();
        }else if(type.equals("Cheese Burger")){
            burger=new CheeseBurger();
        }

        return burger;
    }

}
