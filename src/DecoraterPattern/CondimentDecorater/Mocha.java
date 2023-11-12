package DecoraterPattern.CondimentDecorater;

import DecoraterPattern.Beverage.Beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;
    private final String description = "Mocha" ;
    private final double cost = 0.6;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "," + description;
    }

    public double cost(){
        return beverage.cost() + cost;
    }
}
