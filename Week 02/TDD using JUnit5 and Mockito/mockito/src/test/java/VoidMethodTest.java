import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import com.example.mockito.ExternalApi;

public class VoidMethodTest {

    @Test
    public void testVoidMethod() {
        ExternalApi mockLogger = mock(ExternalApi.class);

        mockLogger.getData("Hello");

        verify(mockLogger).getData("Hello");
    }
}
