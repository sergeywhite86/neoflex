package sergey_white.org.patterns.proxy;

public class DataBaseManagementSystemProxy implements DataBaseManagementSystem {

    public DataBaseManagementSystemImpl originalDBMS;

    public DataBaseManagementSystemProxy(DataBaseManagementSystemImpl originalDMS) {
        this.originalDBMS = originalDMS;
    }

    @Override
    public void connect() {
        String newUrl = String.format("%s/%s", originalDBMS.getUrl(), originalDBMS.getNameDB());
        originalDBMS.setUrl(newUrl);
        originalDBMS.connect();
    }
}
