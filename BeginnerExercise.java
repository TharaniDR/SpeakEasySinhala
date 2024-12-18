import java.awt.*;
import javax.swing.*;

class BeginnerPage extends JFrame {
    // Sample words in Sinhala and English
    private final String[][] vocabulary = {
            {"ඇපල්", "Apple"},
            {"කොම්පියුටර්", "Computer"},
            {"පොත", "Book"},
            {"කුටිය", "House"},
            {"පැන්සල්", "Pencil"},
            {"කුකියා", "Dog"},
            {"පූසාව", "Cat"},
            {"දින", "Day"},
            {"රාත්‍රිය", "Night"},
            {"ජලය", "Water"}
    };

    private int currentWordIndex = 0;

    BeginnerPage() {
        setTitle("Beginner - Sinhala to English");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Title Label
        JLabel titleLabel = new JLabel("Learn Sinhala to English", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        // Word Display Panel
        JPanel wordPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        JLabel sinhalaWord = new JLabel("Sinhala: " + vocabulary[currentWordIndex][0], SwingConstants.CENTER);
        sinhalaWord.setFont(new Font("Arial", Font.PLAIN, 16));
        JLabel englishWord = new JLabel("English: " + vocabulary[currentWordIndex][1], SwingConstants.CENTER);
        englishWord.setFont(new Font("Arial", Font.PLAIN, 16));
        wordPanel.add(sinhalaWord);
        wordPanel.add(englishWord);
        add(wordPanel, BorderLayout.CENTER);

        // Navigation Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton nextButton = new JButton("Next");
        JButton backButton = new JButton("Back");
        buttonPanel.add(backButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Button Actions
        nextButton.addActionListener(e -> {
            currentWordIndex = (currentWordIndex + 1) % vocabulary.length;
            sinhalaWord.setText("Sinhala: " + vocabulary[currentWordIndex][0]);
            englishWord.setText("English: " + vocabulary[currentWordIndex][1]);
        });

        backButton.addActionListener(e -> {
            currentWordIndex = (currentWordIndex - 1 + vocabulary.length) % vocabulary.length;
            sinhalaWord.setText("Sinhala: " + vocabulary[currentWordIndex][0]);
            englishWord.setText("English: " + vocabulary[currentWordIndex][1]);
        });

        setVisible(true);
    }
}