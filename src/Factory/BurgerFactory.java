package Factory;

import Decorator.Burger;
import Decorator.Cheese;
import Decorator.Tomato;

public class BurgerFactory {

    public Burger createBurger(int type){
        Burger burger=null;

        if(type==1){
            burger=new VeganBurger();
            burger.name="Vegan burger";
            burger.desc="Vegan burger";
        }else if(type==2){
            burger=new CheeseBurger();
            burger.name="Cheese burger";
            burger.desc="Cheese burger";
        }else if(type==3){
            burger=new FishBurger();
            burger.name="Fish burger";
            burger.desc="Fish burger";
        }

        return burger;
    }


    public Burger addIngredient(int type, Burger burger) {
        if(type==1){
            burger=new Tomato(burger);
        }else if(type==2){
            burger=new Cheese(burger);
        }
        return burger;
    }
}
