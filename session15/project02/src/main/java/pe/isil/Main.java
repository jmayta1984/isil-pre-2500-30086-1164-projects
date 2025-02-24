package pe.isil;

public class Main {
    public static void main(String[] args) {
        ConexionBD sqlServer = new ConexionSQLServer();
        sqlServer.conectar();
    }
}