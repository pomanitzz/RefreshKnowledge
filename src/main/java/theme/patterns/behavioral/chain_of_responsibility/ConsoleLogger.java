package theme.patterns.behavioral.chain_of_responsibility;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int currentLevel) {
        super(currentLevel);
    }

    @Override
    public String write(String message) {
        return "ConsoleLogger: " + message;
    }
}
