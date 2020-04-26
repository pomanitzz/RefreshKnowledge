package theme.patterns.behavioral.chain_of_responsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int currentLevel) {
        super(currentLevel);
    }

    @Override
    public String write(String message) {
        return "ErrorLogger: " + message;
    }
}
