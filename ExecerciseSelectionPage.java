class ExerciseSelectionPage extends JFrame {
    ExerciseSelectionPage() {
        setTitle("Select Exercise");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 10, 10));

        JLabel instructionLabel = new JLabel("Select an Exercise", SwingConstants.CENTER);
        JButton listeningButton = new JButton("Listening");
        JButton speakingButton = new JButton("Speaking");
        JButton readingButton = new JButton("Reading");
        JButton writingButton = new JButton("Writing");

        // Add components
        add(instructionLabel);
        add(listeningButton);
        add(speakingButton);
        add(readingButton);
        add(writingButton);

        // Action Listeners
        ActionListener exerciseListener = e -> 
            JOptionPane.showMessageDialog(this, "You selected: " + ((JButton) e.getSource()).getText());

        listeningButton.addActionListener(exerciseListener);
        speakingButton.addActionListener(exerciseListener);
        readingButton.addActionListener(exerciseListener);
        writingButton.addActionListener(exerciseListener);

        setVisible(true);
    }
}