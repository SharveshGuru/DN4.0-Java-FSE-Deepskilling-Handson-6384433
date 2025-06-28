import static org.mockito.Mockito.*;
import com.example.mockito.ExternalApi;
import org.junit.jupiter.api.Test;

public class ArgumentMatchingTest {

    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData(anyString())).thenReturn("Matched");

        mockApi.getData("ABC123");

        verify(mockApi).getData(eq("ABC123"));
    }
}
