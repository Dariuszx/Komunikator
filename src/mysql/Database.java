package mysql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import tools.exceptions.ErrorException;

public class Database {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost:3306/test";
    private String username;
    private String password;

    protected Connection polaczenie;
    protected Statement komunikat;

    public Database( String username, String password, String db_url ) {
        this.username = username;
        this.password = password;
        this.DB_URL = db_url;
    }

    public void connect() throws ErrorException {

        try {
            Class.forName( this.DRIVER );
        } catch( ClassNotFoundException e ) {
            throw new ErrorException( "Brak sterownika JDBC" );
        }

        try {
            polaczenie = DriverManager.getConnection( DB_URL, username, password );
            komunikat = polaczenie.createStatement();
        } catch( SQLException e ) {
            throw new ErrorException( "Problem z podłączeniem do bazy danych.");
        }
    }
}
