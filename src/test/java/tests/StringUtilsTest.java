package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.StringUtils;

public class StringUtilsTest {

    @Test
    public void shouldReverseStringPro() {
        String input = "Malwarebytes";
        String result = StringUtils.reverseStringPro(input);
        Assert.assertEquals(result, "setyberawlaM" );
    }

    @Test
    public void shouldReverseStringEasy() {
        String input = "Malwarebytes";
        String result = StringUtils.reverseStringEasy(input);
        Assert.assertEquals(result, "setyberawlaM" );
    }
}
