package State;

import Decorator.Burger;
import Views.MenuViews;

public class ReadyState implements State {
    Waiter waiter;

    public ReadyState(Waiter waiter) {
        this.waiter = waiter;
    }

    public void getOrder() {
        int burger_selection = MenuViews.getSelection();
        Burger burger = waiter.burgerStore.createBurger(burger_selection);
        burger = waiter.burgerStore.addIngredient(MenuViews.addAdditional(), burger);
        waiter.burgerStore.orderBurger(burger);
        waiter.burgerStore.printVoucher(burger);
        waiter.setState(waiter.getPreparingOrderState());
    }

    public void printVoucher() {
        System.out.println("You cannot ask for voucher because there is no order yet!");
    }

    public String toString() {
        return "Ready State";
    }
}
