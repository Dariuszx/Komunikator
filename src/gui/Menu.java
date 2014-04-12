package gui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<JMenu> listOfJMenu;
    private List<JMenuItem> listOfJMenuItem;
    private JMenuBar menubar;

    public Menu( JFrame window ) {

        this.listOfJMenu = new ArrayList<JMenu>();
        this.listOfJMenuItem = new ArrayList<JMenuItem>();
        this.menubar = new JMenuBar();
        window.setJMenuBar( menubar );
    }

    public void addJMenu( String title ) {
        listOfJMenu.add(new JMenu(title));
        menubar.add( listOfJMenu.get( listOfJMenu.size()-1 ) );
    }

    public void addJMenuItem( String submenu_id, JMenuItem add_submenu ) {
        listOfJMenuItem.add( add_submenu );
        findJMenu(submenu_id).add( add_submenu );
    }

    public void addJMenuToJMenuItem( String submenu_id, String title ) {

        JMenu menu = new JMenu( title );
        addJMenuItem( submenu_id, menu );
        listOfJMenu.add(menu);
    }

    public void addJMenuSeparator( String submenu_id ) {
        findJMenu( submenu_id ).addSeparator();
    }

    public JMenu findJMenu( String id ) {
        int i;
        for( i=0; i < listOfJMenu.size(); i++ ) {
            if( listOfJMenu.get( i ).getText().equals( id ) == true ) {
                return listOfJMenu.get( i );
            }
        }
        return null;
    }

    public JMenuItem findJMenuItem ( String id ) {
        int i;
        for( i=0; i < listOfJMenuItem.size(); i++ ) {
            if( listOfJMenuItem.get( i ).getText().equals( id ) == true ) {
                return listOfJMenuItem.get( i );
            }
        }
        return null;
    }
}
