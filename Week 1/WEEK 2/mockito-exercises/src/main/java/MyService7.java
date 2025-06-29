
public class MyService7 {
private ExternalApi4 externalApi;
    
    public MyService7(ExternalApi4 externalApi) {
        this.externalApi = externalApi;
    }
    
    public boolean deleteDataSafely(int id) {
        try {
            externalApi.deleteData(id);
            return true;
        } catch (Exception e) {
            externalApi.logActivity("Error deleting data: " + e.getMessage());
            return false;
        }
    }

}
