package Factory;

import Decorator.Burger;
import Decorator.Cheese;
import Decorator.Tomato;

public class BurgerFactory {

    public Burger createBurger(int type) {
        // As we get input create different types of burgers
        Burger burger = null;
        if (type == 1) {
            burger = new VeganBurger();
        } else if (type == 2) {
            burger = new CheeseBurger();
        } else if (type == 3) {
            burger = new FishBurger();
        }
        return burger;
    }


    public Burger addIngredient(int type, Burger burger) {
        if (type == 1) {
            burger = new Tomato(burger);
        } else if (type == 2) {
            burger = new Cheese(burger);
        }
        return burger;
    }
}
