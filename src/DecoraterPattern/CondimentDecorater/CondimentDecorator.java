package DecoraterPattern.CondimentDecorater;

import DecoraterPattern.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {


    public abstract String getDescription();

    public abstract double cost();

}
