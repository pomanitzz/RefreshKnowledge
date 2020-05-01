package theme.patterns.behavioral.memento;

import org.junit.Assert;
import org.junit.Test;

public class MementoTest {

    @Test
    public void testMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State#1");
        originator.setState("State#2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State#3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State#4");
        careTaker.add(originator.saveStateToMemento());

        Assert.assertEquals("State#2", originator.getStateFromMemento(careTaker.get(0)));
        Assert.assertEquals("State#3", originator.getStateFromMemento(careTaker.get(1)));
        Assert.assertEquals("State#4", originator.getStateFromMemento(careTaker.get(2)));
    }
}
