import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercised5Test {
	@Test
    public void testMultipleReturns() {
        
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        
        when(mockApi.getData())
            .thenReturn("First Call")
            .thenReturn("Second Call")
            .thenReturn("Third Call");
        
        MyService service = new MyService(mockApi);
        
        
        String result1 = service.fetchData();
        String result2 = service.fetchData();
        String result3 = service.fetchData();
        
        assertEquals("First Call", result1);
        assertEquals("Second Call", result2);
        assertEquals("Third Call", result3);
        
      
        verify(mockApi, times(3)).getData();
    }

}
