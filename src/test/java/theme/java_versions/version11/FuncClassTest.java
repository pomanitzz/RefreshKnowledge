package theme.java_versions.version11;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class FuncClassTest {

    @Test
    public void testVar() {
        List<String> collect = List.of("One", "tWo").stream().map((@MarkerInterface var str) -> str.toLowerCase()).collect(Collectors.toList());
        Assert.assertEquals("one", collect.get(0));
        Assert.assertEquals("two", collect.get(1));
    }
}
