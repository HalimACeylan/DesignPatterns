package StrategyPattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void display() {
        System.out.println("I can't fly");
    }
}
