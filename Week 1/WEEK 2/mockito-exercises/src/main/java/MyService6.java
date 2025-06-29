
public class MyService6 {
private ExternalApi4 externalApi;
    
    public MyService6(ExternalApi4 externalApi) {
        this.externalApi = externalApi;
    }
    
    public void processData() {
        externalApi.logActivity("Starting data processing");
        String data = externalApi.getData();
        externalApi.saveData(data, 1);
        externalApi.logActivity("Data processing completed");
    }

}
