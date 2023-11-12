package StrategyPattern.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void display() {
        System.out.println("I can Quack Quack");
    }
}
