package theme.patterns.behavioral.command;

import org.junit.Assert;
import org.junit.Test;
import theme.patterns.behavioral.command.command.GarageDoorDownCommand;
import theme.patterns.behavioral.command.command.GarageDoorUpCommand;
import theme.patterns.behavioral.command.command.LightOffCommand;
import theme.patterns.behavioral.command.command.LightOnCommand;
import theme.patterns.behavioral.command.invoker.RemoteControl;
import theme.patterns.behavioral.command.receiver.GarageDoor;
import theme.patterns.behavioral.command.receiver.Light;

public class CommandSimulatorTest {

    @Test
    public void testCommands() {
        var remoteControl = new RemoteControl(4);
        Light kitchenLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        Assert.assertEquals("No command by default", remoteControl.onCommandWasPushed(0));

        remoteControl.setCommands(0, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remoteControl.setCommands(1, kitchenLight::on, kitchenLight::off); // show that we can use commands just with lambda
        remoteControl.setCommands(2, new GarageDoorUpCommand(garageDoor), new GarageDoorDownCommand(garageDoor));
        remoteControl.setCommands(3, garageDoor::up, garageDoor::down);  // show that we can use commands just with lambda

        Assert.assertEquals(kitchenLight.on(), remoteControl.onCommandWasPushed(0));
        Assert.assertEquals(kitchenLight.off(), remoteControl.offCommandWasPushed(0));

        Assert.assertEquals(kitchenLight.on(), remoteControl.onCommandWasPushed(1));
        Assert.assertEquals(kitchenLight.off(), remoteControl.offCommandWasPushed(1));

        Assert.assertEquals(garageDoor.up(), remoteControl.onCommandWasPushed(2));
        Assert.assertEquals(garageDoor.down(), remoteControl.offCommandWasPushed(2));

        Assert.assertEquals(garageDoor.up(), remoteControl.onCommandWasPushed(3));
        Assert.assertEquals(garageDoor.down(), remoteControl.offCommandWasPushed(3));
    }
}
