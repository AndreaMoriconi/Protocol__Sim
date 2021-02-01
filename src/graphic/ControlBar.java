package graphic;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ControlBar extends JComponent {

    Vector<JButton> myButton;
    JPanel myPanel;
    public ControlBar(){

        int numberOfControls=10;
        myPanel = new JPanel();
        Vector<JButton> myButton = new Vector<JButton>();
        JButton tmp;

        Icon icon;
        for(int i=0; i<numberOfControls; ++i){
            icon = new ImageIcon("src/a_images/Start.png");
            tmp = new JButton(icon);
            tmp.setBackground(Color.cyan);
            tmp.setSize(100, 100);
            //tmp.setIcon();
            myButton.add(tmp);
            myPanel.add(myButton.get(i));
        }
        myPanel.setSize(100, 500);
        this.add(myPanel);
    }
}
