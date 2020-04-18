package theme.patterns.behavioral.command.command;

import theme.patterns.behavioral.command.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return garageDoor.down();
    }
}
