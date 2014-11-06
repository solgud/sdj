import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConverterWindow extends JFrame
{
   // Declare window elements
   private JTextField textField;
   private JButton button;
   private JLabel label;


   // Set a special flag for use later
   private boolean isCelsius = true;
   private double temperature;

   public ConverterWindow()
   {
      // Set the title
      super("C to F");
      setLayout(new FlowLayout());
      // Instantiate the window elements
      label = new JLabel("Celsius: ");
      textField = new JTextField("20");
      button = new JButton("To Fahrenheit");
      
      // Add an evenet listener to the button
      button.addActionListener(new ButtonListener());
      
      // Add the elements to the window
      add(label);
      add(textField);
      add(button);
      
      // Fit the window size to the elements
      pack();
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }
   public static void main(String[] args)
   {
      JFrame window = new ConverterWindow();
      window.setVisible(true);
   }

   private class ButtonListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         // Protect against invalid input
         try {
         temperature = Double.parseDouble(textField.getText());
         } catch(NumberFormatException numberException) {
            System.out.println("Please enter a valid number");
         }

         // If the isCelsius flag is true
         if (isCelsius)
         {
            // Convert Celsius to Fahrenheit
            temperature = ((9.0/5.0) * temperature) + 32;
            
            // Set the labels accordingly
            label.setText("Fahrenheit: ");
            button.setText("To Celsius");
            
            // Set the isCelsius flag to false
            isCelsius = false;
         }
         else
         {
            // Convert Fahrenheit to Celsius
            temperature = (5.0/9.0) * (temperature - 32);
            
            // Set the labels accordingly
            label.setText("Celsius: ");
            button.setText("To Fahrenheit");
            
            // Set the isCelsius flag to true
            isCelsius = true;
         }
         // Set the text field to show the new temperature
         textField.setText("" + temperature);
      }
   }
}
