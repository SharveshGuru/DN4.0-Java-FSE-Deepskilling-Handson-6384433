import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import com.example.mockito.Processor;
public class InteractionOrderTest {

    @Test
    public void testInteractionOrder() {
        Processor mockProcessor = mock(Processor.class);

        mockProcessor.start();
        mockProcessor.process();
        mockProcessor.finish();

        InOrder inOrder = inOrder(mockProcessor);
        inOrder.verify(mockProcessor).start();
        inOrder.verify(mockProcessor).process();
        inOrder.verify(mockProcessor).finish();
    }
}
