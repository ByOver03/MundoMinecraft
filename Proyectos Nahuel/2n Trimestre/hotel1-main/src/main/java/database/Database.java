package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    protected Connection connection;
    // Esto no estoy del todo seguro si esta bien, habria que preguntarselo a Robo
    private final String JDBC_DRIVER = "mysql.jdbc.Driver";
    // Donde pone PORT va el puerto evidentemente, no se cual es el de clase
    private final String DB_URL = "jdbc:mysql//localhost:PORT/hotel";
    
    // Tanto el usuario y la contraseña no me las se asi que he puesto esto por poner algo
    private final String USER = "root";
    private final String PSWD = "1234";
    
    // This method connects to the database
    public void connect() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PSWD);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // This method closes de connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
            
}
