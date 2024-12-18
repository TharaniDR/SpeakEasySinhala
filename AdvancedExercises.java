import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class AdvancedPageSinhala extends JFrame {
    // Sample topics in Sinhala for writing exercises
    private final String[] sinhalaTopics = {
            "මගේ ප්‍රියතම කෑම",
            "පාසලේදී මතකයන්",
            "අපේ ගමේ විශේෂත්වය",
            "මගේ මිතුරෙක්",
            "මට ජීවිතේදී ලැබූ හොඳම පන්තිකරු",
            "මගේ ආදරණීය සුරතලා",
            "අනාගතයේ මගේ සිහිනය",
            "මගේ ප්‍රියතම ක්‍රීඩාව",
            "අපේ රටේ සොඳුරු ස්ථානයක්",
            "අපේ පවුලේ සාමය"
    };

    private String currentTopic;

    AdvancedPageSinhala() {
        setTitle("උසස් මට්ටමේ - ලිවීමේ අභ්‍යාස");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Title Label
        JLabel titleLabel = new JLabel("පිළිබඳව වාක්‍ය 5ක් ලියන්න: පහත විෂයය", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Noto Sans Sinhala", Font.BOLD, 18)); // Noto Sans Sinhala supports Sinhala script
        add(titleLabel, BorderLayout.NORTH);

        // Topic Display Panel
        JPanel topicPanel = new JPanel();
        topicPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel topicLabel = new JLabel("ඔබේ විෂයය: ");
        topicLabel.setFont(new Font("Noto Sans Sinhala", Font.BOLD, 16));
        JTextField topicField = new JTextField(40);
        topicField.setFont(new Font("Noto Sans Sinhala", Font.PLAIN, 14));
        topicField.setEditable(false);
        topicPanel.add(topicLabel);
        topicPanel.add(topicField);
        add(topicPanel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton newTopicButton = new JButton("නව විෂයයක් ලබා ගන්න");
        buttonPanel.add(newTopicButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Text Area for User Input
        JTextArea userInputArea = new JTextArea("ඔබේ වාක්‍ය 5ක් මෙහි ලියන්න...", 10, 50);
        userInputArea.setFont(new Font("Noto Sans Sinhala", Font.PLAIN, 14));
        userInputArea.setLineWrap(true);
        userInputArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(userInputArea);
        add(scrollPane, BorderLayout.EAST);

        // Generate a Random Topic
        generateNewTopic(topicField);

        // Button Action to Get a New Topic
        newTopicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateNewTopic(topicField);
                userInputArea.setText("ඔබේ වාක්‍ය 5ක් මෙහි ලියන්න...");
            }
        });

        setVisible(true);
    }

    private void generateNewTopic(JTextField topicField) {
        Random random = new Random();
        currentTopic = sinhalaTopics[random.nextInt(sinhalaTopics.length)];
        topicField.setText(currentTopic);
    }

    public static void main(String[] args) {
        new AdvancedPageSinhala();
    }
}