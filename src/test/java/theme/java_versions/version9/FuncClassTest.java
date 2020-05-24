package theme.java_versions.version9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class FuncClassTest {

    @Test
    public void testCollectionFactory() {
        Set<String> set = Set.of("one", "two");
        Assert.assertEquals(2, set.size());
    }

    @Test
    public void testPrivateInterfMethod() {
        InterfaceNewFunc interfaceNewFunc = new InterfaceNewFunc() {};
        Assert.assertEquals("some string", interfaceNewFunc.getSomeString());
    }
}
