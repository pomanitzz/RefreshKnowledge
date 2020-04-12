package theme.patterns.behavioural.strategy.domain;

import theme.patterns.behavioural.strategy.behavior.FlyNoWay;
import theme.patterns.behavioural.strategy.behavior.Quack;

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
