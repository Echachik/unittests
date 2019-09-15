import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcCosTest extends CalcBaseTest {

    @DataProvider(name = "dataForCos")
    public static java.lang.Object[][] dataForCos() {
        return new java.lang.Object[][]{
                {0, 1.0000},
                {90, 0.0},
                {180, -1.0},
                {270, 0.0}};
    }

    @Test(dataProvider = "dataForCos", groups = {"double"})
    public void cosTest(double degreesCelsius, double expected) {

        double toRadians = Math.toRadians(degreesCelsius);
        double actual = calculator.cos(toRadians);
        Assert.assertEquals(actual, expected);


    }
}
