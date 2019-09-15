import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcMultDoubleTest extends CalcBaseTest{

    @DataProvider(name = "dataForMultDouble")
    public static java.lang.Object[][] DataForMultDouble() {
        return new java.lang.Object[][]{
                {10., 2, 20.},
                {-1., 2, -2},
                {5, 5, 25},
                {25., -1, -25.0},{5.0,0.0,0.0}};

    }

    @Test(dataProvider = "dataForMultDouble", groups = {"double"})
    public void testPow(double first, double second, double expected) {
        double mult = calculator.mult(first, second);
        Assert.assertEquals(mult, expected);
    }
}
