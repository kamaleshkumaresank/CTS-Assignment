
public class MyService4 {
	  private ExternalApi4 externalApi;
	    
	    public MyService4(ExternalApi4 externalApi) {
	        this.externalApi = externalApi;
	    }
	    
	    public void removeData(int id) {
	        externalApi.logActivity("Deleting data with ID: " + id);
	        externalApi.deleteData(id);
	    }

}
