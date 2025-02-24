package pe.isil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLServer implements ConexionBD {

    private Connection conexion;

    @Override
    public void conectar() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=EduTec;encrypt=true;user=sa;password=sa";
 

        try {
            conexion = DriverManager.getConnection(url);
            
            System.out.println("Conectado a SQL Server");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void desconectar() {
    }

}
