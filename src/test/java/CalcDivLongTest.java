import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcDivLongTest extends CalcBaseTest{

    @DataProvider(name = "DataForDiv")
    public static Object[][] DataForDiv() {
        return new Object[][]{
                {50, 2, 25},
                {20, 20, 1},
                {-5,5, -1}};
    }

    @Test( dataProvider = "DataForDiv", groups = {"long"})
    public void firstDivideSecond(long first, long second, long expected) {
        long div = calculator.div(first, second);
        Assert.assertEquals(div, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero",
            groups = {"double"})
    public void devisionOnZero() {
        calculator.div(1, 0);
    }

}
