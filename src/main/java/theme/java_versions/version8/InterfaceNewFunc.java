package theme.java_versions.version8;

public interface InterfaceNewFunc {
    static String getStaticText() {
        return "static text";
    }

    default String getDefaultText() {
        return "default text";
    }

    String getImplementedText();
}
