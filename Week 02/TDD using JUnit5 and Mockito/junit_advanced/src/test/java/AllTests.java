import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestClassA.class, TestClassB.class })
public class AllTests {
}
