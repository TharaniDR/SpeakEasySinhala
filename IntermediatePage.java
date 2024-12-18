import java.awt.*;
import javax.swing.*;

class IntermediatePage extends JFrame {
    // Sample sentences in English and Sinhala
    private final String[][] sentences = {
            {"I am going to school.", "මම පාසල් යනවා."},
            {"What is your name?", "ඔබේ නම කුමක්ද?"},
            {"She likes to eat apples.", "ඇයට ඇපල් කෑමට කැමතියි."},
            {"The dog is barking.", "බල්ලා බොඳුනවා."},
            {"We are reading a book.", "අපි පොතක් කියවමින් සිටිමු."},
            {"Do you know the way?", "ඔබට මාර්ගය දැනෙයිද?"},
            {"They are playing football.", "ඔවුන් පාපන්දු ක්‍රීඩා කරයි."},
            {"The sun is shining brightly.", "සූර්යයා දැකුම්මට ලස්සනින් දිලිසෙයි."},
            {"I want to learn Sinhala.", "මම සිංහල ඉගෙන ගැනීමට කැමතියි."},
            {"This is my favorite place.", "මේ මගේ ප්‍රියතම ස්ථානයයි."}
    };

    private int currentSentenceIndex = 0;

    IntermediatePage() {
        setTitle("Intermediate - English to Sinhala Sentences");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Title Label
        JLabel titleLabel = new JLabel("Learn Sentence Translation: English to Sinhala", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        // Sentence Display Panel
        JPanel sentencePanel = new JPanel(new GridLayout(2, 1, 5, 5));
        JLabel englishSentence = new JLabel("English: " + sentences[currentSentenceIndex][0], SwingConstants.CENTER);
        englishSentence.setFont(new Font("Arial", Font.PLAIN, 16));
        JLabel sinhalaSentence = new JLabel("Sinhala: " + sentences[currentSentenceIndex][1], SwingConstants.CENTER);
        sinhalaSentence.setFont(new Font("Arial", Font.PLAIN, 16));
        sentencePanel.add(englishSentence);
        sentencePanel.add(sinhalaSentence);
        add(sentencePanel, BorderLayout.CENTER);

        // Navigation Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton nextButton = new JButton("Next");
        JButton backButton = new JButton("Back");
        buttonPanel.add(backButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Button Actions
        nextButton.addActionListener(e -> {
            currentSentenceIndex = (currentSentenceIndex + 1) % sentences.length;
            englishSentence.setText("English: " + sentences[currentSentenceIndex][0]);
            sinhalaSentence.setText("Sinhala: " + sentences[currentSentenceIndex][1]);
        });

        backButton.addActionListener(e -> {
            currentSentenceIndex = (currentSentenceIndex - 1 + sentences.length) % sentences.length;
            englishSentence.setText("English: " + sentences[currentSentenceIndex][0]);
            sinhalaSentence.setText("Sinhala: " + sentences[currentSentenceIndex][1]);
        });

        setVisible(true);
    }
}
