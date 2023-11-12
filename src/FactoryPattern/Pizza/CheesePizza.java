package FactoryPattern.Pizza;

import FactoryPattern.Ingredient.Cheese;
import FactoryPattern.Ingredient.Dough;
import FactoryPattern.Ingredient.Sauce;
import FactoryPattern.Ingredient.Veggies;
import FactoryPattern.PizzaIngredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
