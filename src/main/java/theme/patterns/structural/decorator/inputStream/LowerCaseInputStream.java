package theme.patterns.structural.decorator.inputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        var ch = in.read();
        return ch == -1 ? ch : Character.toLowerCase((char)ch);
    }

}
