package theme.patterns.behavioral.chain_of_responsibility;

public class FileLogger extends AbstractLogger {

    public FileLogger(int currentLevel) {
        super(currentLevel);
    }

    @Override
    public String write(String message) {
        return "FileLogger: " + message;
    }
}
