package FactoryPattern.Pizza;

import FactoryPattern.Ingredient.*;
import FactoryPattern.PizzaIngredientFactory.PizzaIngredientFactory;

public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

}
