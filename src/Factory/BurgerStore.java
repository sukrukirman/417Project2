package Factory;

import Decorator.Burger;
import Facade.BurgerStoreFacade;

import java.util.ArrayList;

public class BurgerStore {
    public BurgerFactory burgerFactory;
    public BurgerStoreFacade burgerStoreFacade;
    private ArrayList<Burger> orderList;

    public BurgerStore(BurgerFactory burgerFactory, BurgerStoreFacade burgerStoreFacade) {
        this.burgerFactory = burgerFactory;
        this.burgerStoreFacade = burgerStoreFacade;
        orderList=new ArrayList<>();
    }

    public Burger orderBurger(Burger burger) {
        burger.prepare();
        burger.box();
        return burger;
    }

    public Burger addIngredient(int type, Burger burger) {
        // Ingredients add additional cost to the burger
        burger=burgerFactory.addIngredient(type,burger);
        return burger;
    }

    public Burger createBurger(int type) {
        return burgerFactory.createBurger(type);
    }

    public void printVoucher(Burger burger){
        System.out.println("Total cost is :"+ burger.cost()+"$");
    }

    public ArrayList<Burger> getOrderList() {
        return orderList;
    }
}
