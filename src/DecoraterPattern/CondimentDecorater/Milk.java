package DecoraterPattern.CondimentDecorater;

import DecoraterPattern.Beverage.Beverage;
public class Milk extends CondimentDecorator{
    Beverage beverage;
    private final String description = "Milk" ;
    private final double cost = 0.34;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "," + description;
    }

    public double cost(){
        return beverage.cost() + cost;
    }
}
