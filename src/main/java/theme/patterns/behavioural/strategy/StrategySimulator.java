package theme.patterns.behavioural.strategy;

import theme.patterns.behavioural.strategy.behavior.FlyRocketPowered;
import theme.patterns.behavioural.strategy.domain.Duck;
import theme.patterns.behavioural.strategy.domain.MallardDuck;
import theme.patterns.behavioural.strategy.domain.ModelDuck;

public class StrategySimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
