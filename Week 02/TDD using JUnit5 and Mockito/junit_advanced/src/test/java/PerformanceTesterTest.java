import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.example.junitadvanced.PerformanceTester;

public class PerformanceTesterTest {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testPerformTaskWithinTime() {
        PerformanceTester tester = new PerformanceTester();
        tester.performTask();
    }
}
