package theme.java_versions.version13;

import org.junit.Assert;
import org.junit.Test;

public class FuncClassTest {

    @Test
    public void testTextBlock() {
        Assert.assertEquals("""
                 <html>
                   <body>
                     <p>My web page</p>
                   </body>
                 </html>
                """, HelloHtmlUtil.getHelloHtml());
    }
}
