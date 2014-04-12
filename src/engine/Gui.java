package engine;

import gui.InitializeMenu;
import gui.windows.MainWindow;

public class Gui {

    MainWindow window; //Okno główne

    public Gui() {
        window = new MainWindow( 800, 600, "Komunikator 1.0" );
        new InitializeMenu( window ); // Tworzę pasek pasek_menu
        window.ShowWindow(); //Wyświetlam okno
    }
}
