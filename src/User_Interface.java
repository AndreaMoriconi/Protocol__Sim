import animation.sprites.Board;

import java.awt.*;
import javax.swing.*;

public class User_Interface extends JFrame {

    public User_Interface() {

        initUI();
    }
    private void initUI() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width-400, Toolkit.getDefaultToolkit().getScreenSize().height);
        this.setLayout(new BorderLayout());
        setResizable(true);
        this.setVisible(true);
        //add(new ControlPanel());
        add(new Board());
        pack();
    }
}
