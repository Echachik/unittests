import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcSinTest extends CalcBaseTest {

    @DataProvider(name = "dataForSin")
    public static java.lang.Object[][] dataForSin() {
        return new java.lang.Object[][]{
                {0, 0.0},
                {90, 1.0}};
    }

    @Test(dataProvider = "dataForSin", groups = {"double"})
    public void tangTest(double degreesCelsius, double expected) {
        double toRadians = Math.toRadians(degreesCelsius);
        double sin = calculator.sin(toRadians);
        Assert.assertEquals(sin, expected);
    }


}
