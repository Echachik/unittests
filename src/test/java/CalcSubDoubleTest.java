import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcSubDoubleTest extends CalcBaseTest {


    @DataProvider(name = "DataForSubDouble")
    public static Object[][] DataForSubDouble() {
        return new Object[][]{
                {5.5, 5.5, 0},
                {0.0, 0.0, 0.0},
                {0, 1.5, -1.5}};
    }

    @Test( dataProvider = "DataForSubDouble", groups = {"double"})
    public void subTest(double first, double second, double expected) {
        double sub = calculator.sub(first, second);
        Assert.assertEquals(sub, expected);
    }


}
