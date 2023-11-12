package FactoryPattern.PizzaStore;

import FactoryPattern.Pizza.Pizza;

public abstract class PizzaStore {



    public abstract Pizza createAPizza(String type);
}
