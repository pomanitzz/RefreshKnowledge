package theme.patterns.structural.adapter;

public class Bus implements MovableCapacity {
    @Override
    public int ableMaxDistanceInKilometers() {
        return 250;
    }

    @Override
    public int ableMaxTimeInHours() {
        return 5;
    }
}
