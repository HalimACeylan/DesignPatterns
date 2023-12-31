package FactoryPattern.PizzaIngredientFactory;

import FactoryPattern.Ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();

}
