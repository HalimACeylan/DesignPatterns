package TemplatePattern.Beverage;

import TemplatePattern.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea ");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding lemon");
    }
}
