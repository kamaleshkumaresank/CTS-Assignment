
public class MyService3 {
    private ExternalApi3 externalApi;
    
    public MyService3(ExternalApi3 externalApi) {
        this.externalApi = externalApi;
    }
    
    public String fetchDataById(int id) {
        return externalApi.getDataById(id);
    }
    
    public void saveImportantData(String data) {
        externalApi.saveData(data, 1); // priority 1 for important data
    }

}
