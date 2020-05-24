package theme.java_versions.version9;

public interface InterfaceNewFunc {
    default String getSomeString () {
        return someString();
    }

    private String someString() {
        return "some string";
    }
}
