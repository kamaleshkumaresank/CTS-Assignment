import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercised4Test {
	@Test
    public void testVoidMethod() {
        ExternalApi4 mockApi = Mockito.mock(ExternalApi4.class);
        
        
        doNothing().when(mockApi).deleteData(anyInt());
        doNothing().when(mockApi).logActivity(anyString());
        
        MyService4 service = new MyService4(mockApi);
        
        service.removeData(456);
        
        
        verify(mockApi).logActivity("Deleting data with ID: 456");
        verify(mockApi).deleteData(456);
    }

}
