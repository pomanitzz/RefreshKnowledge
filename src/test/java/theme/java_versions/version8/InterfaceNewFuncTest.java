package theme.java_versions.version8;

import org.junit.Assert;
import org.junit.Test;

public class InterfaceNewFuncTest {

    @Test
    public void testNewFunc() {
        InterfaceNewFunc interfaceNewFunc = () -> "implemented text";
        Assert.assertEquals("static text", InterfaceNewFunc.getStaticText());
        Assert.assertEquals("default text", interfaceNewFunc.getDefaultText());
        Assert.assertEquals("implemented text", interfaceNewFunc.getImplementedText());
    }
}
