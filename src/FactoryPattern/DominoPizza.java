package FactoryPattern;

import FactoryPattern.PizzaStore.NyPizzaStore;
import FactoryPattern.PizzaStore.PizzaStore;

public class DominoPizza {

    public static void main(String[] args) {
        PizzaStore NYPizzaStore = new NyPizzaStore();
        NYPizzaStore.createAPizza("cheese");
        NYPizzaStore.createAPizza("veggie");

    }
}
