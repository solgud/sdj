import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class ColorDemo extends JFrame
{
   private String[] colorNames = {"Red", "Blue", "Green", "Black"};

   public ColorDemo()
   {
      // Set up window
      super("Color Demo");
      setLayout(new GridLayout(1, 3, 5, 5));
      
      // Set up the background color picker
      JPanel backgroundPanel = new JPanel();
      backgroundPanel.setLayout(new GridLayout(4,1));
      
      // Add radio buttons to the panel
      // Making a button group to make only one radio button selectable at a time
      ButtonGroup backgroundButtonGroup = new ButtonGroup();
      for (int i = 0; i < this.colorNames.length; i++)
      {
         // Add the radio buttons to the button group and then the panel
         JRadioButton radioButton = new JRadioButton(this.colorNames[i]);
         radioButton.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
         backgroundButtonGroup.add(radioButton);
         backgroundPanel.add(radioButton);
      }
      // Set a title for the background panel
      backgroundPanel.setBorder(BorderFactory.createTitledBorder("Background"));
      
      // Set up the foreground color picker
      JPanel foregroundPanel = new JPanel();
      foregroundPanel.setLayout(new GridLayout(4,1));
      
      // Add radio buttons to the panel
      // Making a button group to make only one radio button selectable at a time
      ButtonGroup foregroundButtonGroup = new ButtonGroup();
      for (int i = 0; i < this.colorNames.length; i++)
      {
         // Add the radio buttons to the button group and then the panel
         JRadioButton radioButton = new JRadioButton(this.colorNames[i]);
         radioButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
         foregroundButtonGroup.add(radioButton);
         foregroundPanel.add(radioButton);
      }
      // Set a title for the foreground panel
      foregroundPanel.setBorder(BorderFactory.createTitledBorder("Foreground"));
      
      // Set up the results panel
      // Create an outer results panel 
      // that controls the outer border/padding
      JPanel outerResultsPanel = new JPanel();
      outerResultsPanel.setLayout(new BorderLayout());

      // Give a compound border (padding + beveled border) to the outer panel
      Border innerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
      Border outerBorder = BorderFactory.createLoweredBevelBorder();
      outerResultsPanel.setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));

      // Create the inner results panel
      // that holds the text and background
      JPanel innerResultsPanel = new JPanel();
      innerResultsPanel.setLayout(new BoxLayout(innerResultsPanel, BoxLayout.X_AXIS));

      // Add a centered text label to the inner panel
      innerResultsPanel.add(Box.createHorizontalGlue());
      innerResultsPanel.add(new JLabel("Text"));
      innerResultsPanel.add(Box.createHorizontalGlue());
      
      // Add the inner panel to the outer
      outerResultsPanel.add(innerResultsPanel, BorderLayout.CENTER);
      
      // Set default settings for the results panel
      innerResultsPanel.setForeground(Color.black);
      innerResultsPanel.setBackground(Color.green);
      
      
      // Add the three main panels to the window
      add(backgroundPanel);
      add(foregroundPanel);
      add(outerResultsPanel);
      pack();
   }
   
   
   public static void main(String[] args)
   {
      JFrame frame = new ColorDemo();
      frame.setVisible(true);
   }

}
