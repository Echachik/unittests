import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcCtgTest extends CalcBaseTest {

    @DataProvider(name = "dataForCtg")
    public static java.lang.Object[][] dataForCtg() {
        return new java.lang.Object[][]{
                {45, 1.0},
                {90, 0.0}};
    }


    @Test(dataProvider = "dataForCtg", groups = {"double"})
    public void ctgTest(double degreesCelsius, double expected) {
        double ctg = calculator.ctg(degreesCelsius);
        Assert.assertEquals(ctg, expected);
    }
}
