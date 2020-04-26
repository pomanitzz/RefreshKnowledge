package theme.patterns.behavioral.chain_of_responsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int ERROR = 2;
    public static int WARN = 3;

    private final int currentLevel;
    private AbstractLogger nextLogger;

    public AbstractLogger(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public String logMessage(int lvl, String message) {
        if (currentLevel == lvl) {
            return write(message);
        }
        if (nextLogger != null) {
            return nextLogger.logMessage(lvl, message);
        }
        return null;
    }

    public abstract String write(String message);

}
