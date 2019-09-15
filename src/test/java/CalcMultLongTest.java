import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcMultLongTest extends CalcBaseTest {

    @DataProvider(name = "dataForMultLong")
    public static java.lang.Object[][] dataForMultLong() {
        return new java.lang.Object[][]{
                {10, 2, 20},
                {-1, 2, -2},
                {5, 3, 15},
                {25, -1, -25},{5,5,25}};

    }

    @Test(dataProvider = "dataForMultLong", groups = {"long"})
    public void testPow(long first, long second, long expected) {
        long exp = calculator.mult(first, second);
        Assert.assertEquals(exp, expected);
    }


}
