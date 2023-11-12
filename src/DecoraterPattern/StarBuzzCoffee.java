package DecoraterPattern;

import DecoraterPattern.Beverage.Beverage;
import DecoraterPattern.Beverage.Espresso;
import DecoraterPattern.CondimentDecorater.Milk;
import DecoraterPattern.CondimentDecorater.Mocha;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println( "desc is: " + beverage1.getDescription() + " cost is : " +  beverage1.cost());
    }
}
