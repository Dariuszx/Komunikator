package gui.windows;

import javax.swing.*;

public class MainWindow extends JFrame {

    private int x;
    private int y;
    private String title;
    public JDesktopPane desktop;

    public MainWindow( int x, int y, String title ) {

        this.x = x;
        this.y = y;
        this.title = title;
        this.desktop = new JDesktopPane();
        add( desktop );

        CreateWindow();
    }

    protected void CreateWindow() {

        setTitle( title );
        setSize( x, y );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    public void ShowWindow() {

        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        setVisible(true);
                    }
                });
    }
}
