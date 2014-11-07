import java.awt.*;
import javax.swing.*;


public class CalculatorWindow extends JFrame
{
   private static final long serialVersionUID = 1L;
   
   // Declare window elements
   private JPanel textPanel;
   private JPanel buttonPanel;
   
   // Being lazy and making a pre-ordered string array for the calculator
   // This is probably a bad idea
   private String[] buttons = {"7", "8", "9", "/",
                               "4", "5", "6", "*",
                               "1", "2", "3", "-",
                               "0", ".", "=", "+"};
   public CalculatorWindow()
   {
      super("Calculator");
      setLayout(new BorderLayout());
      
      // Initialize the text panel
      textPanel = new JPanel();
      // Give it a box layout
      textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.X_AXIS));
      // Add a generic text field
      textPanel.add(new TextField());
      // Add to the North of the window (won't resize)
      add(textPanel, BorderLayout.NORTH);

      // Initialize the buttons panel
      buttonPanel = new JPanel();
      // Give it a 4x4 grid layout
      buttonPanel.setLayout(new GridLayout(4, 4));
      // Add all the buttons from the array
      for(int i = 0; i < buttons.length; i++)
      {
         buttonPanel.add(new JButton(buttons[i]));
      }
      // Add to the Center of the window (resizes)
      add(buttonPanel, BorderLayout.CENTER);
      
      // Compact to the elements
      pack();
   }
   
   public static void main(String[] args)
   {
      // Set up and show the window
      JFrame frame = new CalculatorWindow();
      frame.setVisible(true);
   }

}
