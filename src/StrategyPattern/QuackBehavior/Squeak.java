package StrategyPattern.QuackBehavior;

public class Squeak implements QuackBehavior{

    @Override
    public void display() {
        System.out.println("I can squeak squeak");
    }
}
