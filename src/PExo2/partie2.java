package PExo2;

import java.awt.*;
import javax.swing.*;

public class partie2 extends JFrame {
    public partie2() {
        super("BoxLayout");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelName = new JLabel("Nom :");
        JTextField textFieldName = new JTextField();
        textFieldName.setMaximumSize(new Dimension(200, 20));
        textFieldName.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelPassword = new JLabel("Mot de passe :");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(200, 20));
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(labelName);
        panel.add(textFieldName);
        panel.add(labelPassword);
        panel.add(passwordField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton buttonOk = new JButton("Ok");
        buttonOk.addActionListener(e -> {
            String name = textFieldName.getText();
            char[] password = passwordField.getPassword();

            JFrame frame = new JFrame("Nouvelle fenêtre");
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
            frame.setSize(300, 140);
            frame.setVisible(true);
            JLabel labelarea = new JLabel("Vous avez appuyez sur ok ");
            labelarea.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel labelName1 = new JLabel("Nom : " + name);
            labelName1.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel labelPassword1 = new JLabel("Mot de passe : " + new String(password));
            labelPassword1.setAlignmentX(Component.CENTER_ALIGNMENT);
            JButton buttonOk1 = new JButton("Ok");
            buttonOk1.setAlignmentX(Component.CENTER_ALIGNMENT);

            frame.add(labelarea);
            frame.add(labelName1);
            frame.add(labelPassword1);
            frame.add(buttonOk1);
            buttonOk1.addActionListener(e1 -> frame.dispose());

        });
        JButton buttonCancel = new JButton("Cancel");

        buttonCancel.addActionListener(e -> {
            String name = textFieldName.getText();
            char[] password = passwordField.getPassword();

            JFrame frame = new JFrame("Nouvelle fenêtre");
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
            frame.setSize(300, 140);
            frame.setVisible(true);
            JLabel labelarea = new JLabel("Vous avez appuyez sur : Cancel ");
            labelarea.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel labelName1 = new JLabel("Nom : " + name);
            labelName1.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel labelPassword1 = new JLabel("Mot de passe : " + new String(password));
            labelPassword1.setAlignmentX(Component.CENTER_ALIGNMENT);
            JButton buttonOk1 = new JButton("Ok");
            buttonOk1.setAlignmentX(Component.CENTER_ALIGNMENT);

            frame.add(labelarea);
            frame.add(labelName1);
            frame.add(labelPassword1);
            frame.add(buttonOk1);
            buttonOk1.addActionListener(e1 -> frame.dispose());

        });

        buttonPanel.add(buttonOk);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(buttonCancel);

        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.PAGE_END);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new partie2();
    }
}
