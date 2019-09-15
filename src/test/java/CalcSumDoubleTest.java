import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcSumDoubleTest extends CalcBaseTest {

    @DataProvider(name = "DataForSumDouble")
    public static java.lang.Object[][] DataForSumDouble() {
        return new java.lang.Object[][]{
                {5.0, 5.0, 10.0}, {-5.0, 5.0, 0},
                {0, 0, 0}, {-5.0, -5.0, -10.0}, {5.25, 5.25, 10.5}};
    }

    @Test(description = "Verifies sum of two numbers for double type", dataProvider = "DataForSumDouble",
            groups = {"double"})
    public void firstPlusSecond(double first, double second, double expected) {
        double sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
    }

}
