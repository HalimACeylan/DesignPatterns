package StrategyPattern.Duck;

import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.QuackBehavior.QuackBehavior;

public class MallardDuck extends Duck{


    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Hello from Mallard Duck");
        flyBehavior.display();
        quackBehavior.display();
    }
}
