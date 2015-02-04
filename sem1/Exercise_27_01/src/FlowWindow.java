import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowWindow extends JFrame
{
   private static final long serialVersionUID = 1L;

   // Declare the window elements
   private JLabel label1;
   private JLabel label2;
   private JTextField text;
   private JButton button;

   public FlowWindow()
   {
      // Write a title
      super("Flow layout");

      // Set as a Flow Layout
      setLayout(new FlowLayout());

      // Instantiate the window elements
      label1 = new JLabel("This is a label");
      label2 = new JLabel("And another JLabel");
      text = new JTextField("Next is a textbox");
      button = new JButton("A JButton");
      // Add an event listener to the button
      button.addActionListener(new ButtonListener());
      
      // Add all the elements to the window
      add(label1);
      add(text);
      add(button);
      add(label2);
      
      // Size the window so that it just fits all the elements
      pack();
      // Make sure the program exits when the window closes
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   private class ButtonListener implements ActionListener
   {
      // Handle click events on the button
      @Override
      public void actionPerformed(ActionEvent e)
      {
         // Set the content of the second label
         label2.setText("Button pressed");
      }
   }


   // Program
   public static void main(String[] args)
   {
      // Make a new Flow Window
      JFrame window = new FlowWindow();
      // Show the Flow Window
      window.setVisible(true);
   }
}
