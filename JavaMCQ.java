import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaMCQ {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java MCQs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 1000);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        addQuestion(panel, "1. What are the types of data types in Java?", "A. Primitive Data types\nB. Non-primitive Data Types\nC. Both of Above", "C. Both of Above");
        addQuestion(panel, "2. Which is not a primitive data type?", "A. Boolean\nB. Character\nC. Arrays\nD. Integer", "C. Arrays");
        addQuestion(panel, "3. Which are the non-primitive data types?", "A. Arrays\nB. Classes\nC. Interfaces\nD. All of Above", "D. All of Above");
        addQuestion(panel, "4. What is the default value of boolean?", "A. true\nB. false\nC. '1'\nD. '0'", "B. false");
        addQuestion(panel, "5. What is the default size of boolean datatype?", "A. 2 bytes\nB. 4 bytes\nC. 1 bit\nD. 2 bits", "C. 1 bit");
        addQuestion(panel, "6. What is the default value of char?", "A. ''\nB. '0000'\nC. '0'\nD. '\\u0000'", "D. \\u0000");
        addQuestion(panel, "7. What is the default size of char?", "A. 1 byte\nB. 2 bytes\nC. 4 bytes\nD. 8 bytes", "B. 2 bytes");
        addQuestion(panel, "8. What is the default value of byte?", "A. 0 default value\nB. 0b default value\nC. 0.0 default value\nD. 0.0f default value", "A. 0 default value");
        addQuestion(panel, "9. What is the default size of byte?", "A. 1 bit\nB. 1 byte\nC. 2 bytes\nD. 4 bytes", "B. 1 byte");

        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);
        frame.setVisible(true);
    }

    private static void addQuestion(JPanel panel, String question, String options, String answer) {
        JLabel questionLabel = new JLabel(question);
        JTextArea optionsArea = new JTextArea(options);
        optionsArea.setEditable(false);
        optionsArea.setBackground(panel.getBackground());

        JLabel feedbackLabel = new JLabel();
        feedbackLabel.setForeground(Color.RED);

        JComboBox<String> comboBox = new JComboBox<>(options.split("\\n"));
        JButton submitButton = new JButton("Submit Answer");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedAnswer = (String) comboBox.getSelectedItem();
                if (selectedAnswer != null && selectedAnswer.startsWith(answer.substring(0, 1))) {
                    feedbackLabel.setText("Correct!");
                    feedbackLabel.setForeground(Color.GREEN);
                } else {
                    feedbackLabel.setText("Wrong! Correct answer is: " + answer);
                    feedbackLabel.setForeground(Color.RED);
                }
            }
        });

        panel.add(questionLabel);
        panel.add(optionsArea);
        panel.add(comboBox);
        panel.add(submitButton);
        panel.add(feedbackLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing between questions
    }
}
