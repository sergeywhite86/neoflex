package sergey_white.org.patterns.proxy;

public class DataBaseManagementSystemImpl implements DataBaseManagementSystem {

    private final String nameDB = "postgres";

    private String url;

    public DataBaseManagementSystemImpl(String url) {
        this.url = url;
    }

    @Override
    public void connect() {
        System.out.printf("%s\n", url);
    }

    public String getNameDB() {
        return nameDB;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
