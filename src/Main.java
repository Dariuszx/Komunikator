
import gui.*;
import javax.swing.SwingUtilities;

public class Main {

    public static void main( String[] args ) {

        InitializeWindow window = new InitializeWindow( 200, 200, "Tytuł" );
        InitializeMenu b = new InitializeMenu( window );
        window.ShowWindow();
    }
}
