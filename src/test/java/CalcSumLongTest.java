import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcSumLongTest extends CalcBaseTest {

    @DataProvider(name = "DataForSumLong")
    public static java.lang.Object[][] DataForSumLong() {
        return new java.lang.Object[][]{
                {1, 0, 1}, {-1, 2, 1},
                {0, 0, 0}, {-20, 20, 0}, {500, 500, 1000}};
    }

    @Test(description = "Verifies sum of two numbers for Long type",
            dataProvider = "DataForSumLong", groups = {"long"})
    public void firstPlusSecond(long first, long second, long expected) {
        long sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
    }

}
