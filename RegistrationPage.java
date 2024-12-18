class RegistrationPage extends JFrame {
    RegistrationPage() {
        setTitle("Registration Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JLabel confirmPassLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPassField = new JPasswordField();
        JButton registerButton = new JButton("Register");

        // Add components
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(confirmPassLabel);
        add(confirmPassField);
        add(new JLabel());
        add(registerButton);

        // Action Listener
        registerButton.addActionListener(e -> {
            String password = new String(passField.getPassword());
            String confirmPassword = new String(confirmPassField.getPassword());

            if (password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Registration Successful!");
                dispose();
                new LoginPage();
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match!");
            }
        });

        setVisible(true);
    }
}