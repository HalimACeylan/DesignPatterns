package FactoryPattern.PizzaStore;

import FactoryPattern.Pizza.NYStyleCheesePizza;
import FactoryPattern.Pizza.NYStyleVeggiePizza;
import FactoryPattern.Pizza.Pizza;
import FactoryPattern.PizzaIngredientFactory.NYPizzaIngredientFactory;
import FactoryPattern.PizzaIngredientFactory.PizzaIngredientFactory;

public class NyPizzaStore extends PizzaStore{


    public void ScheduledDelivery(){

    }

    @Override
    public Pizza createAPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza(pizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza(pizzaIngredientFactory);
        } else return null;
    }
}
