public class AppConfi {
    
    private String serverUrl;
    private int port;

  
    private static AppConfi instance;

    private AppConfi() {
    }

    public static synchronized AppConfi getInstance() {
        if (instance == null) {
            instance = new AppConfi();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    
}