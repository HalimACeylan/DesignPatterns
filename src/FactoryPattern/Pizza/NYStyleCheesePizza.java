package FactoryPattern.Pizza;

import FactoryPattern.Ingredient.Cheese;
import FactoryPattern.Ingredient.Dough;
import FactoryPattern.Ingredient.Sauce;
import FactoryPattern.Ingredient.Veggies;
import FactoryPattern.PizzaIngredientFactory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
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
