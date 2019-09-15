import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcDivDoubleTest extends CalcBaseTest {

    @DataProvider(name = "DataForDivDouble")
    public static Object[][] DataForDivDouble() {
        return new Object[][]{
                {50.00, 25.00, 2.00},
                {-3.0, -2.0, 1.5}};
    }

    @Test( dataProvider = "DataForDivDouble",
            groups = {"double"})
    public void firstDivideSecond(double first, double second, double expected) {
        double div = calculator.div(first, second);
        Assert.assertEquals(div, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero",
            groups = {"double"})
    public void doubleDivisionOnZero() {
        calculator.div(1.00, 0.0);
    }
}
