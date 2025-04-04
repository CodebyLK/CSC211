import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Registration extends JFrame {
    public Registration() {
        JFrame frame = new JFrame("User Registration");
        JPanel userPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        userPanel.add(new JLabel("Name: "));
        JTextField nameField = new JTextField();
        userPanel.add(nameField);

        userPanel.add(new JLabel("Email: "));
        JTextField emailField = new JTextField();
        userPanel.add(emailField);

        userPanel.add(new JLabel("Password: "));
        JPasswordField passwordField = new JPasswordField();
        userPanel.add(passwordField);

        userPanel.add(new JLabel("Confirm Password: "));
        JPasswordField confirmPasswordField = new JPasswordField();
        userPanel.add(confirmPasswordField);

        JButton submitButton = new JButton("Submit");
        userPanel.add(submitButton);

        JButton clearButton = new JButton("Clear");
        userPanel.add(clearButton);

        userPanel.setBorder(new EmptyBorder(15, 15, 15, 15));

        frame.add(userPanel, BorderLayout.CENTER);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fillName = nameField.getText();
                String fillEmail = emailField.getText();
                String fillPassword = new String(passwordField.getPassword());
                String fillConfirmPassword = new String(confirmPasswordField.getPassword());

                if (fillName.isEmpty() || fillEmail.isEmpty() || fillPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.");
                }
                else if (!fillPassword.equals(fillConfirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match.");
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Registration Complete!");
                }
            }
    });

    clearButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
        }
    });

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 225);
        frame.setVisible(true);
        

    }
    public static void main(String[]args) {
        JFrame frame1 = new Registration();
           
    }
}
