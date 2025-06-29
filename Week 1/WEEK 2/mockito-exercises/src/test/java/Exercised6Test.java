import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class Exercised6Test {
	@Test
    public void testInteractionOrder() {
        
        ExternalApi4 mockApi = Mockito.mock(ExternalApi4.class);
        
        
        when(mockApi.getData()).thenReturn("Processed Data");
        
        MyService6 service = new MyService6(mockApi);
        
        
        service.processData();
        
        
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).logActivity("Starting data processing");
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).saveData("Processed Data", 1);
        inOrder.verify(mockApi).logActivity("Data processing completed");
    }

}
