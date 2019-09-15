import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcPowTest extends CalcBaseTest{

    @DataProvider(name = "dataForPow")
    public static java.lang.Object[][] dataForPow() {
        return new java.lang.Object[][]{
                {10., 2, 100.},
                {-1., 2, 1.},
                {5, 3, 125},
                {25., -1, 0.04},};

    }

    @Test(dataProvider = "dataForPow", groups = {"double"})
    public void testPow(double first, double second, double expected) {
        double pow = calculator.pow(first, second);
        Assert.assertEquals(pow, expected);
    }

}
