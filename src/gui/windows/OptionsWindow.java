package gui.windows;

import javax.swing.*;

public class OptionsWindow extends WindowPanel implements WindowPanelPropeties {

    public OptionsWindow( MainWindow window ) {

        super( window );
        setPanelPropeties( window.desktop );
        window.desktop.add( iframe );
    }

    public void setPanelPropeties( JDesktopPane panel ) {
        iframe = new JInternalFrame( "Options", false, true, false, false );
        iframe.setBounds( 50, 50, 200, 200 );
        iframe.setVisible( true );
        iframe.setToolTipText( "Coś tam" );
    }

}
