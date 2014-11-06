import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class HelloWindow extends JFrame
{
   private static final long serialVersionUID = 1L;
   
   // Declare the window elements
<<<<<<< HEAD
   private JButton button = new JButton("Click me!");
   private JTextField text = new JTextField("World");
   private JFrame frame;
=======
   JButton button = new JButton("Click me!");
   JTextField text = new JTextField("World");
   JFrame frame;
>>>>>>> a08f4fade57b5b196abbe760925a2176b79acd16

   public HelloWindow()
   {
      // Set the title
      super("Second Window");
      // Set layout as a Flow Layout
      setLayout(new FlowLayout());

      // Add the window elements
      add(button);
      add(text);

      // Add an event listener to the button
      button.addActionListener(new ButtonListener());
      // Make the window just large enough to contain the elements
      pack();
      
      // End the program when the window closes
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args)
   {
      // Make the window
      JFrame window = new HelloWindow();
      // Show the window
      window.setVisible(true);
   }
   
   // Implement event handler for the button
   private class ButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         // Prepare the text to be shown
         String textToShow = "Hello, " + text.getText() + "!";
         // Make a frame to show that text
         JOptionPane.showMessageDialog(frame, textToShow);
      }
   }
   

}
