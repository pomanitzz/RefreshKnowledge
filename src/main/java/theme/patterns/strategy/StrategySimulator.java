package theme.patterns.strategy;

import theme.patterns.strategy.behavior.FlyRocketPowered;
import theme.patterns.strategy.domain.Duck;
import theme.patterns.strategy.domain.MallardDuck;
import theme.patterns.strategy.domain.ModelDuck;

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
