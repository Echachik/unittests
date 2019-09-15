import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalctIsPositiveTest extends CalcBaseTest {

    @DataProvider(name = "dataForIsPositive")
    public static Object[][] dataForIsPositive() {
        return new Object[][]{
                {1L, true},
                {-1L, false},
                {0L, false},
                {400000L, false}};
    }


    @Test( dataProvider = "dataForIsPositive", groups = {"positive"})
    public void firstDivideSecond(long first, boolean expected) {
        boolean positive = calculator.isPositive(first);
        Assert.assertEquals(positive, expected);
    }

}
