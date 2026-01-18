package tests.UtilsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.StringUtils;

import java.util.Set;

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

    @Test
    public void shouldFindDuplicates() {
        Set<Character> result = StringUtils.findDuplicatesChar("Malwarebytes");
        Assert.assertTrue(result.contains('a'));
        Assert.assertTrue(result.contains('e'));
    }

    @Test
    public void checkAnagrams() {
        Assert.assertTrue(StringUtils.areAnagrams("listen","silent"), "the words are not anagrams");
        Assert.assertFalse( StringUtils.areAnagrams("hello","bello"), "the words are anagrams");
    }
}
