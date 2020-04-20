package theme.patterns.behavioral.state;

import org.junit.Assert;
import org.junit.Test;

public class StateTest {

    @Test
    public void testGumballMachine() {
        var gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        Assert.assertEquals("HasQuarterState", gumballMachine.getCurrentState().toString());
        gumballMachine.ejectQuarter();
        Assert.assertEquals("NoQuarterState", gumballMachine.getCurrentState().toString());
        Assert.assertEquals("no action", gumballMachine.ejectQuarter());
        Assert.assertEquals("no action no action", gumballMachine.turnCrank());
        gumballMachine.insertQuarter();
        Assert.assertEquals("turned dispensed", gumballMachine.turnCrank());
        Assert.assertEquals("NoQuarterState", gumballMachine.getCurrentState().toString());
        Assert.assertEquals(1, gumballMachine.getCurrentGumBallCount());
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        Assert.assertEquals("SoldOutState", gumballMachine.getCurrentState().toString());
        Assert.assertEquals("no action", gumballMachine.ejectQuarter());
        Assert.assertEquals("no action no action", gumballMachine.turnCrank());
        Assert.assertEquals(0, gumballMachine.getCurrentGumBallCount());
        Assert.assertEquals("have no gum", gumballMachine.insertQuarter());
    }

}
