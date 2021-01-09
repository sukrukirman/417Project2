package Factory;

import Decorator.Burger;
import Decorator.Cheese;

public class BurgerFactory {

    public Burger createBurger(int type){
        Burger burger=null;

        if(type==1){
            burger=new VeganBurger();
        }else if(type==2){
            burger=new CheeseBurger();
        }

        return burger;
    }

}
