package TemplatePattern.Beverage;

import TemplatePattern.CaffeineBeverage;

public class Coffe extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping caffe through filter");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding Sugar and Milk");
    }
}
