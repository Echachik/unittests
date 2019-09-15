import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.epam.tat.module4.Calculator;


public class CalcBaseTest {

    protected Calculator calculator;

    @BeforeClass(groups = "config")
    public void setup() {
        System.out.println("start of test " + this.getClass());
        calculator = new Calculator();
    }

    @AfterClass(groups = "config")
    public void tearDown() {
        System.out.println("finish of the test " + this.getClass());
    }
}
