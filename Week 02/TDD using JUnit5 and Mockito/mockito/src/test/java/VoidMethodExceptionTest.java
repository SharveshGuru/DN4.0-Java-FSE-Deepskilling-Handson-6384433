import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import com.example.mockito.ExternalApi;

public class VoidMethodExceptionTest {

    @Test
    public void testVoidMethodThrowsException() {
        ExternalApi mockLogger = mock(ExternalApi.class);

        doThrow(new RuntimeException("Logging failed"))
            .when(mockLogger)
            .getData("error");

        try {
            mockLogger.getData("error");
        } catch (RuntimeException e) {
            assert e.getMessage().equals("Logging failed");
        }

        verify(mockLogger).getData("error");
    }
}
