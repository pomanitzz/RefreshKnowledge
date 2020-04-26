package theme.patterns.behavioral.chain_of_responsibility;

import org.junit.Assert;
import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void testChain() {
        var consoleLoggerChain = new ConsoleLogger(AbstractLogger.INFO);
        var errorLoggerChain = new ErrorLogger(AbstractLogger.ERROR);
        var warnLoggerChain = new FileLogger(AbstractLogger.WARN);

        consoleLoggerChain.setNextLogger(errorLoggerChain);
        errorLoggerChain.setNextLogger(warnLoggerChain);

        Assert.assertEquals("ConsoleLogger: mess", consoleLoggerChain.logMessage(AbstractLogger.INFO, "mess"));
        Assert.assertEquals("ErrorLogger: mess", consoleLoggerChain.logMessage(AbstractLogger.ERROR, "mess"));
        Assert.assertEquals("FileLogger: mess", consoleLoggerChain.logMessage(AbstractLogger.WARN, "mess"));
    }
}
