package theme.patterns.behavioral.command.invoker;

import theme.patterns.behavioral.command.command.Command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(int totalOnOffCommandsNumber) {
        this.onCommands = new Command[totalOnOffCommandsNumber];
        this.offCommands = new Command[totalOnOffCommandsNumber];
        Command noCommand = () -> {
            return "No command by default";
        };
        for (int i = 0; i < totalOnOffCommandsNumber; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommands(int position, Command onCommand, Command offCommand) {
        this.onCommands[position] = onCommand;
        this.offCommands[position] = offCommand;
    }

    public String onCommandWasPushed(int position) {
        return this.onCommands[position].execute();
    }

    public String offCommandWasPushed(int position) {
        return this.offCommands[position].execute();
    }

}
