import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcSubLongTest extends CalcBaseTest {

    @DataProvider(name = "DataForSubLong")
    public static Object[][] DataForSubLong() {
        return new Object[][]{
                {50, 50, 0},
                {20, 10, 10},
                {-5,-5, 0}};
    }

    @Test( dataProvider = "DataForSubLong", groups = {"long"})
    public void subTest(long first, long second, long expected) {
        long sub = calculator.sub(first, second);
        Assert.assertEquals(sub, expected);
    }

}
