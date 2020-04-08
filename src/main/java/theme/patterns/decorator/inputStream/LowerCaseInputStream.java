package theme.patterns.decorator.inputStream;

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

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        var result = in.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
