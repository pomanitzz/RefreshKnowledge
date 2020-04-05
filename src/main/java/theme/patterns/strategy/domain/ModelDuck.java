package theme.patterns.strategy.domain;

import theme.patterns.strategy.behavior.FlyNoWay;
import theme.patterns.strategy.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
