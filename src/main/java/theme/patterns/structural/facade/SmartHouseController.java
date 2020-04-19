package theme.patterns.structural.facade;

public class SmartHouseController {
    private final Door door;
    private final Light light;
    private final TV tv;

    public SmartHouseController(Door door, Light light, TV tv) {
        this.door = door;
        this.light = light;
        this.tv = tv;
    }

    public String startWatchMovie() {
        return String.format("%s * %s * %s", light.off(), tv.on(), door.close());
    }

    public String stopWatchMovie() {
        return String.format("%s * %s * %s", light.on(), tv.off(), door.open());
    }

}
