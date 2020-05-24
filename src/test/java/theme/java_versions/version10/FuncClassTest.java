package theme.java_versions.version10;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FuncClassTest {

    @Test
    public void testVars() {
        var list = List.of("one", "two");
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testVar() {
        FuncClass funcClass = new FuncClass();
        Assert.assertEquals("someVaraaa", funcClass.getVar("aaa"));
    }

}
