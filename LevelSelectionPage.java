class LevelSelectionPage extends JFrame {
    LevelSelectionPage() {
        setTitle("Select Your Level");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        JLabel welcomeLabel = new JLabel("Choose Your Level", SwingConstants.CENTER);
        JButton beginnerButton = new JButton("Beginner");
        JButton intermediateButton = new JButton("Intermediate");
        JButton advancedButton = new JButton("Advanced");

        // Add components
        add(welcomeLabel);
        add(beginnerButton);
        add(intermediateButton);
        add(advancedButton);

        // Action Listeners
        ActionListener levelListener = e -> {
            JOptionPane.showMessageDialog(this, "You selected: " + ((JButton) e.getSource()).getText());
            dispose();
            new ExerciseSelectionPage();
        };

        beginnerButton.addActionListener(levelListener);
        intermediateButton.addActionListener(levelListener);
        advancedButton.addActionListener(levelListener);

        setVisible(true);
    }
}