package theme.patterns.structural.decorator.inputStream;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class LowerCaseInputStreamTest {

    public static final String THIS_STRING_SHOULD_BE_CONVERTED_TO_LOWER_CASE_UPPER = "This string Should be converted to LOWER case.";
    public static final String THIS_STRING_SHOULD_BE_CONVERTED_TO_LOWER_CASE_LOWER = "this string should be converted to lower case.";

    @Test
    public void testRead() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
            int ch;
            LowerCaseInputStream inputStream = new LowerCaseInputStream(
                        new ByteArrayInputStream(THIS_STRING_SHOULD_BE_CONVERTED_TO_LOWER_CASE_UPPER.getBytes())
            );
            while ((ch = inputStream.read()) > 0) {
                stringBuilder.append((char) ch);
            }
        Assert.assertEquals(THIS_STRING_SHOULD_BE_CONVERTED_TO_LOWER_CASE_LOWER, stringBuilder.toString());
    }

}
