package TemplatePattern;

import TemplatePattern.Beverage.*;

public class Cafe {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();

        tea.PrepareRecipe();
        System.out.println("next order is caffe");
        coffe.PrepareRecipe();

    }
}
