package theme.java_versions.version12;

import org.junit.Assert;
import org.junit.Test;

public class FuncClassTest {

    @Test
    public void testSwitch() {
        Day day = Day.FRIDAY;
        int result = 0;
        switch (day) {
            case MONDAY, TUESDAY -> result = 1;
            case FRIDAY -> result = 2;
            case SUNDAY -> result = 3;
        }
        Assert.assertEquals(2, result);
    }
}
