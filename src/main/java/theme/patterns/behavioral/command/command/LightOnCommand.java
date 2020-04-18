package theme.patterns.behavioral.command.command;

import theme.patterns.behavioral.command.receiver.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.on();
    }
}
