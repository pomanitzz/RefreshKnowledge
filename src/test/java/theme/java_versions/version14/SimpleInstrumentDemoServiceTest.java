package theme.java_versions.version14;

import org.junit.Assert;
import org.junit.Test;
import theme.java_versions.version14.instance_of.Instrument;
import theme.java_versions.version14.instance_of.SimpleInstrumentDemoService;
import theme.java_versions.version14.instance_of.Violin;

public class SimpleInstrumentDemoServiceTest {
    @Test
    public void testInstrument() {
        SimpleInstrumentDemoService service = new SimpleInstrumentDemoService();
        var instrumentDescription = service.getInstrumentDescription(new Instrument());
        Assert.assertEquals("Instrument say: I am Instrument", instrumentDescription);
    }

    @Test
    public void testViolin() {
        SimpleInstrumentDemoService service = new SimpleInstrumentDemoService();
        var instrumentDescription = service.getInstrumentDescription(new Violin());
        Assert.assertEquals("Violin say: I am Violin", instrumentDescription);
    }
}
