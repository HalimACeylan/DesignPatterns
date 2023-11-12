package StrategyPattern;
import StrategyPattern.Duck.*;
import StrategyPattern.FlyBehavior.*;
import StrategyPattern.QuackBehavior.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(),new Quack());
        Duck modelDuck = new ModelDuck(new FlyRocketPowered(), new MuteQuack());
        modelDuck.display();
        mallardDuck.display();
    }
}
