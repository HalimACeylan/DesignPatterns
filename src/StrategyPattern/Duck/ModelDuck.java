package StrategyPattern.Duck;
import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.QuackBehavior.QuackBehavior;

public class ModelDuck extends Duck{

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am Model Duck");
        flyBehavior.display();
        quackBehavior.display();
    }
}
