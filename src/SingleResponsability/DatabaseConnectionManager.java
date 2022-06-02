package SingleResponsability;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection connection;
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {

    }

    public DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Conexiunea la baza de date s-a stabilit...");
    }
    public Connection getConnObject(){
        return connection;
    }
    public void disconnect() throws SQLException{
        connection.close();
        System.out.println("Deconectare de la baza de date...");
    }

}

