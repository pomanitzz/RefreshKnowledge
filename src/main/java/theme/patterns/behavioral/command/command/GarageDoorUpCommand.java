package theme.patterns.behavioral.command.command;

import theme.patterns.behavioral.command.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return garageDoor.up();
    }
}
