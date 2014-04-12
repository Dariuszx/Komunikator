package gui;

import gui.windows.MainWindow;
import tools.exceptions.events.ExitEvent;
import tools.exceptions.events.OpenWindowEvent;

import javax.swing.*;

public class InitializeMenu  {

    public Menu pasek_menu;

    public InitializeMenu( MainWindow window ) {

        pasek_menu = new Menu( window ); //Tworzę pasek menu
        pasek_menu.addJMenu("File");
        pasek_menu.addJMenu("Edit");
        pasek_menu.addJMenu("View");
        pasek_menu.addJMenu("Help");
        pasek_menu.addJMenuItem("File", new JMenuItem("New"));
        pasek_menu.addJMenuItem("File", new JMenuItem("Options"));
        pasek_menu.addJMenuItem("File", new JMenuItem("Open"));
        pasek_menu.addJMenuItem("File", new JMenuItem("Save"));
        pasek_menu.addJMenuSeparator("File");
        pasek_menu.addJMenuToJMenuItem("File", "Inne Menu");
        pasek_menu.addJMenuSeparator("File");
        pasek_menu.addJMenuItem("Inne Menu", new JMenuItem("Cos tam"));
        pasek_menu.addJMenuItem("File", new JMenuItem("Exit"));


        pasek_menu.findJMenuItem("Exit").addActionListener( new ExitEvent() );
        pasek_menu.findJMenuItem("Options").addActionListener( new OpenWindowEvent( window, "Options" ) );
    }
}
