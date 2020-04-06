package theme.patterns.strategy.behavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rocket!");
    }
}
