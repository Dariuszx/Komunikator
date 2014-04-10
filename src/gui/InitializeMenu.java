package gui;

import javax.swing.*;

public class InitializeMenu  {

    Menu menu;

    public InitializeMenu( JFrame window ) {

        menu = new Menu( window );
        menu.addJMenu( "File" );
        menu.addJMenu( "Edit" );
        menu.addJMenu( "View" );
        menu.addJMenu( "Help" );
        menu.addJMenuItem( "File", new JMenuItem( "New" ) );
        menu.addJMenuItem( "File", new JMenuItem( "Open" ) );
        menu.addJMenuItem( "File", new JMenuItem( "Save" ) );
        menu.addJMenuSeparator( "File" );
        menu.addJMenuToJMenuItem( "File", "Inne Menu" );
        menu.addJMenuSeparator( "File" );
        menu.addJMenuItem( "Inne Menu", new JMenuItem( "Cos tam" ) );
        menu.addJMenuItem( "File", new JMenuItem( "Exit" ) );
    }



}
