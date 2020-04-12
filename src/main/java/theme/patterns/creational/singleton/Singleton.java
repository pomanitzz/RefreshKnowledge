package theme.patterns.creational.singleton;

public class Singleton {
    public static Singleton instance;
    private final String stateString;

    private Singleton() {
        stateString = "State";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String getStateString() {
        return stateString;
    }
}
