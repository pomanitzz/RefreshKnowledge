package theme.patterns.structural.adapter;

public class Car implements MovableCapacity {
    @Override
    public int ableMaxDistanceInKilometers() {
        return 400;
    }

    @Override
    public int ableMaxTimeInHours() {
        return 4;
    }
}
