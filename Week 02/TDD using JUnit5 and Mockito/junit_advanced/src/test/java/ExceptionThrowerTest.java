import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import com.example.junitadvanced.ExceptionThrower;

public class ExceptionThrowerTest {

    @Test
    void testExceptionIsThrown() {
        ExceptionThrower thrower = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            thrower.throwException(true);
        });
    }
}
