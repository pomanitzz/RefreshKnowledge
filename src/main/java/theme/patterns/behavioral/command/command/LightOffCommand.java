package theme.patterns.behavioral.command.command;

import theme.patterns.behavioral.command.receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.off();
    }
}
