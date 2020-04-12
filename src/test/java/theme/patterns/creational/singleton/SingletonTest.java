package theme.patterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton singleton = Singleton.getInstance();
        Assert.assertEquals("State", singleton.getStateString());
        Assert.assertEquals(singleton, Singleton.getInstance());
    }
}
