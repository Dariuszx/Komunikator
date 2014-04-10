package gui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<JMenu> submenu;
    private JMenuBar menubar;

    public Menu( JFrame window ) {

        this.submenu = new ArrayList<JMenu>();
        this.menubar = new JMenuBar();
        window.setJMenuBar( menubar );
    }

    public void addJMenu( String title ) {
        submenu.add( new JMenu( title ) );
        menubar.add( submenu.get( submenu.size()-1 ) );
    }

    public JMenu findJMenu( String submenu_id ) {
        int i;
        for( i=0; i < submenu.size(); i++ ) {
            if( submenu.get( i ).getText().equals( submenu_id ) == true ) {
                return submenu.get( i );
            }
        }
        return null;
    }

    public void addJMenuItem( String submenu_id, JMenuItem add_submenu ) {
        findJMenu( submenu_id ).add( add_submenu );
    }

    public void addJMenuToJMenuItem( String submenu_id, String title ) {

        JMenu menu = new JMenu( title );
        addJMenuItem( submenu_id, menu );
        submenu.add( menu );
    }

    public void addJMenuSeparator( String submenu_id ) {
        findJMenu( submenu_id ).addSeparator();
    }
}
