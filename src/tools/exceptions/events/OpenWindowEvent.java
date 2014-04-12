package tools.exceptions.events;

import gui.windows.MainWindow;
import gui.windows.OptionsWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenWindowEvent implements ActionListener {

    private MainWindow window;
    private String option;

    public OpenWindowEvent( MainWindow window, String option ) {
        this.window = window;
        this.option = option;
    }

    @Override
    public void actionPerformed( ActionEvent actionEvent ) {

        if( option.equals( "Options") ) new OptionsWindow( window );

    }

}
