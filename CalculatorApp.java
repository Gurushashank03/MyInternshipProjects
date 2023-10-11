import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {
    // Create UI components
    private JTextField numField1, numField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public CalculatorApp() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create text fields for input and result
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field read-only

        // Create buttons for operations
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        // Add action listeners to the buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // Create panels for organizing components
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2));

        // Add components to input panel
        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(numField1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(numField2);
        inputPanel.add(new JLabel("Result:"));
        inputPanel.add(resultField);

        // Add components to button panel
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        // Create a main panel for the frame
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        add(mainPanel);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the numbers from the input fields
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        double result = 0.0;

        // Perform the selected operation
        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Display the result
        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorApp());
    }
}
