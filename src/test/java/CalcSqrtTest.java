import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcSqrtTest extends CalcBaseTest {


    @DataProvider(name = "dataForSqrt")
    public static java.lang.Object[][] dataForSqrt() {
        return new java.lang.Object[][]{
                {4.0, 2.0},
                {25.00, 5.0},
                {0, 0}};
    }

    @Test(dataProvider = "dataForSqrt", groups = {"double"}, priority = 0)
    public void sqrtOfNumber(double first, double expected) {
        double sqrt = calculator.sqrt(first);
        Assert.assertEquals(sqrt, expected);
    }

}
