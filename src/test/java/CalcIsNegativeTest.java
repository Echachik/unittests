import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcIsNegativeTest extends CalcBaseTest {

    @DataProvider(name = "dataForIsNegative")
    public static Object[][] dataForIsNegative() {
        return new Object[][]{
                {1L, false},
                {-1L, true},
                {0L, false},
                {-5555L, true}};
    }


    @Test( dataProvider = "dataForIsNegative", groups = {"negative"})
    public void firstDivideSecond(long first, boolean expected) {
        boolean negative = calculator.isNegative(first);
        Assert.assertEquals(negative, expected);
    }

}
