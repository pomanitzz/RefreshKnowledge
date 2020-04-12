package theme.patterns.behavioral.strategy.domain;

import theme.patterns.behavioral.strategy.behavior.FlyNoWay;
import theme.patterns.behavioral.strategy.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public String display() {
        return "Model Duck!";
    }
}
