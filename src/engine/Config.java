package engine;

import mysql.Database;
import tools.exceptions.ErrorException;

public class Config {

    protected Database mysql;

    public Config() {

        try {
            mysql = new Database("root", "gh37binary", "jdbc:mysql://localhost:3306/test");
            mysql.connect();
        } catch( ErrorException e ) {
            e.HandleException();
        }

    }


}
