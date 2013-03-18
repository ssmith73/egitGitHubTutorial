package myGuiBlocks;

import javax.swing.*;
import java.awt.Color;

public class PanelExample{
    
     public JPanel createContentPane (){
        
        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        
        // We set the Layout Manager to null so we can manually place
        // the Panels.
        totalGUI.setLayout(null);
        
        totalGUI.setBackground(Color.DARK_GRAY);
        
        // Now we create a new panel, size it, shape it,color it red.
        // then add it to the bottom JPanel.
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setLocation(10, 10);
        redPanel.setSize(50,50);
        redPanel.setToolTipText("RED is best");
        totalGUI.add(redPanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setLocation(80, 10);
        greenPanel.setSize(50,50);
        totalGUI.add(greenPanel);
        
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setLocation(150, 10);
        yellowPanel.setSize(50,50);
        totalGUI.add(yellowPanel);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setLocation(220, 10);
        bluePanel.setSize(50, 50);
        totalGUI.add(bluePanel);
        
        // Finally we return the JPanel.
        totalGUI.setOpaque(true);
        totalGUI.setVisible(true);
        return totalGUI;
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] There's 5 JPanels in here! [=]");
        
        //Create and set up the content pane.
        PanelExample demo = new PanelExample();
        frame.setContentPane(demo.createContentPane());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(290, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}