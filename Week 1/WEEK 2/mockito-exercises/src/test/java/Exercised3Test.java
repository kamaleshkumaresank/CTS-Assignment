import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercised3Test {
    @Test
    public void testArgumentMatching() {
        
        ExternalApi3 mockApi = Mockito.mock(ExternalApi3.class);
        
        when(mockApi.getDataById(anyInt())).thenReturn("Data for any ID");
        
        MyService3 service = new MyService3(mockApi);
        
        
        service.fetchDataById(123);
        service.saveImportantData("Important Data");
        
        
        verify(mockApi).getDataById(eq(123));
        verify(mockApi).saveData(eq("Important Data"), eq(1));
        verify(mockApi).getDataById(anyInt()); 
    }

}
