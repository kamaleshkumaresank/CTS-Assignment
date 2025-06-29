
public interface ExternalApi4 {
	String getData();
    void deleteData(int id);
    void logActivity(String message);
    void saveData(String data, int priority);

}
