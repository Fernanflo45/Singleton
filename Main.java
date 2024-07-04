public class Main {
    public static void main(String[] args) {
        AppConfi config = AppConfi.getInstance();

        config.setServerUrl("http://miapi.com");
        config.setPort(8080);

        // Obtener propiedades de configuración y utilizarlas
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto: " + config.getPort());
    }
}