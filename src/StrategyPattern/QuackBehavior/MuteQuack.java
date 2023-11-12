package StrategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void display() {
        System.out.println(".... .... ...");
    }
}
