package engine;

import gui.InitializeMenu;
import gui.InitializeWindow;

public class Gui {

    InitializeWindow window;

    public Gui() {
        this.window = new InitializeWindow( 800, 600, "Komunikator 1.0" );
        new InitializeMenu( window ); // Tworzę pasek menu
        window.ShowWindow();
    }
}
