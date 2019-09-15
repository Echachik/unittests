import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTangTest extends CalcBaseTest {

    @DataProvider(name = "dataForTang")
    public static java.lang.Object[][] dataForTang() {
        return new java.lang.Object[][]{
                {0, 0.0},
                {45, 1.0}};
    }


    @Test(dataProvider = "dataForTang", groups = {"double"})
    public void tangTest(double degreesCelsius, double expected) {
      //  double toRadians = Math.toRadians(degreesCelsius);
        double tan = calculator.ctg(degreesCelsius);
        Assert.assertEquals(tan, expected);
    }
}
