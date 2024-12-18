class LoginPage extends JFrame {
    LoginPage() {
        setTitle("Login Page");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        // Add components
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginButton);
        add(registerButton);

        // Action Listeners
        loginButton.addActionListener(e -> {
            // Simple check (replace with actual validation)
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                dispose(); // Close Login Page
                new LevelSelectionPage(); // Open Level Selection Page
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            }
        });

        registerButton.addActionListener(e -> {
            dispose();
            new RegistrationPage(); // Open Registration Page
        });

        setVisible(true);
    }
}