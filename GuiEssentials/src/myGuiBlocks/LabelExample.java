package myGuiBlocks;
import javax.swing.*;
import java.awt.Color;

/*
 *    --------Root Pane --(top level containers)------
 *   |												  |
 *   |	 JFrame, JDialog or JApplet					  |	
 *   |												  |
 *   |    -------------Layered Pane -----------------------
 *   |   |			  								       |
 *   |   |			  								       |
 *   |   |										           |
 *   |   | 	   -------------Content Pane -----------------------
 *   |   |	  |		 	  								        |
 *   |   |	  |_MENU BAR__(not actually part of content pane)___|
 *   |   |    |		 	  								        |
 *   |   |    |		 	  								        |
 *   |   |	  | All text, buttons and graphics go on this pane	|	
 *    ---|	  |		(contains all visible components of root)								 		    |	
 *       |	  |										 		  	|	
 *        ----| 												|
 * 			  | 												|
 *             -------------------------------------------------
 *               
 *               AND A GLASS PANE OVER ALL 
 *               
 */

public class LabelExample{

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
//        totalGUI.setBackground(Color.DARK_GRAY);

        // Creation of a Panel to contain the JLabels
        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setLocation(10, 0);
        textPanel.setSize(260, 30);
        textPanel.setBorder(BorderFactory.createBevelBorder(1));
        textPanel.setBorder(BorderFactory.createDashedBorder(null));
        totalGUI.add(textPanel);

        // First JLabel, outputs "Red".
        // Added to the 'textPanel' JPanel
        JLabel redLabel = new JLabel("Red");
        redLabel.setLocation(0, 0);
        redLabel.setSize(50, 40);
        redLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textPanel.add(redLabel);

        // Second JLabel, outputs "Yellow"
        JLabel yellowLabel = new JLabel("Yellow");
        yellowLabel.setLocation(70, 0);
        yellowLabel.setSize(50, 40);
        yellowLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textPanel.add(yellowLabel);

        JLabel greenLabel = new JLabel("Green");
        greenLabel.setLocation(140, 0);
        greenLabel.setSize(50, 40);
        greenLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textPanel.add(greenLabel);

        JLabel blueLabel = new JLabel("Blue");
        blueLabel.setLocation(210, 0);
        blueLabel.setSize(50, 40);
        blueLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textPanel.add(blueLabel);

        // Creates a panel to hold the following panels.
        JPanel panelForPanels = new JPanel();
        panelForPanels.setLayout(null);
        panelForPanels.setLocation(10, 40);
        panelForPanels.setSize(260, 50);
        totalGUI.add(panelForPanels);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setLocation(0, 0);
        redPanel.setSize(50, 50);
        panelForPanels.add(redPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setLocation(70, 0);
        yellowPanel.setSize(50, 50);
        panelForPanels.add(yellowPanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setLocation(140, 0);
        greenPanel.setSize(50, 50);
        panelForPanels.add(greenPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setLocation(210, 0);
        bluePanel.setSize(50, 50);
        panelForPanels.add(bluePanel);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JLabel Fables [=]");

        //Create and set up the content pane.
        LabelExample demo = new LabelExample();
        frame.setContentPane(demo.createContentPane());

        // The other bits and pieces that make our program a bit more stable.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(290, 130);
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