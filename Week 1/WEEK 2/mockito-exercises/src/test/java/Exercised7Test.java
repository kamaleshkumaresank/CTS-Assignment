import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercised7Test {
	@Test
    public void testVoidMethodWithException() {
        
        ExternalApi4 mockApi = Mockito.mock(ExternalApi4.class);
        
        
        doThrow(new RuntimeException("Database connection failed"))
            .when(mockApi).deleteData(789);
        
        MyService7 service = new MyService7(mockApi);
        

        boolean result = service.deleteDataSafely(789);
        
        assertFalse(result); 
        
        
        verify(mockApi).deleteData(789);
        verify(mockApi).logActivity("Error deleting data: Database connection failed");
    }
    
    @Test
    public void testVoidMethodWithoutException() {
       
        ExternalApi4 mockApi = Mockito.mock(ExternalApi4.class);
        doNothing().when(mockApi).deleteData(789);
        
        MyService7 service = new MyService7(mockApi);
        boolean result = service.deleteDataSafely(789);
        
        assertTrue(result); 
        verify(mockApi).deleteData(789);
        verify(mockApi, never()).logActivity(anyString()); 
    }

}
