package gui;

import javax.swing.*;

public class InitializeWindow extends JFrame {

    private int x;
    private int y;
    private String title;

    public InitializeWindow( int x, int y, String title ) {

        this.x = x;
        this.y = y;
        this.title = title;

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
