import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import com.example.mockito.ExternalApi;
import org.junit.jupiter.api.Test;

public class MultipleReturnsTest {

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
            .thenReturn("First")
            .thenReturn("Second")
            .thenReturn("Third");

        assertEquals("First", mockApi.getData());
        assertEquals("Second", mockApi.getData());
        assertEquals("Third", mockApi.getData());
    }
}
