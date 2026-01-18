package tests.UtilsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ArrayUtils;

public class ArrayUtilsTest {

    @Test
    public void shouldReversArrays() {
        int[] data = {1,2,3,4,5,6,7,8,9};
        ArrayUtils.reverseArray(data);
        Assert.assertEquals(data, new int[]{9,8,7,6,5,4,3,2,1});
    }
}
