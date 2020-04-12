package theme.patterns.behavioural.strategy.domain;

import theme.patterns.behavioural.strategy.behavior.FlyBehavior;
import theme.patterns.behavioural.strategy.behavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public abstract String display();

    public String swim() {
        return "All ducks can swim!";
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
