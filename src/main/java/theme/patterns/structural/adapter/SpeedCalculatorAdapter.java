package theme.patterns.structural.adapter;

public class SpeedCalculatorAdapter implements Speed {
    private MovableCapacity movableCapacity;

    public SpeedCalculatorAdapter(MovableCapacity movableCapacity) {
        this.movableCapacity = movableCapacity;
    }

    @Override
    public int calculateAbleAverageSpeed() {
        return movableCapacity.ableMaxDistanceInKilometers() / movableCapacity.ableMaxTimeInHours();
    }
}
