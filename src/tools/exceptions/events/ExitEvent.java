package tools.exceptions.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitEvent implements ActionListener {

    @Override
    public void actionPerformed( ActionEvent actionEvent ) {
        System.exit( 0 );
    }
}

