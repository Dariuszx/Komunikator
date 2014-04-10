package engine;

import mysql.Database;
import tools.exceptions.ErrorException;

public class Engine {

    protected Database mysql;
    protected Gui user_interface;

    public Engine() {

        this.user_interface = new Gui(); /* Tworzę UI */

        try {
            mysql = new Database("root", "gh37binary", "jdbc:mysql://localhost:3306/test");
            mysql.connect();
        } catch( ErrorException e ) {
            e.HandleException();
        }

    }


}
