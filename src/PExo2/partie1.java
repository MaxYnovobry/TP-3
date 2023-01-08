package PExo2;

import javax.swing.*;
import java.awt.*;

public class partie1 {

    public static void main (String[] args) {
        JFrame frame = new JFrame("Bouton exemple");

        JLabel label = new JLabel("Regardez ces jolis boutons !", JLabel.CENTER);
        frame.add(label);

        // Création d'un JPanel pour afficher les boutons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        frame.add(buttonPanel);

        // Definition des boutons
        JButton btn1 = new JButton("Bouton simple ");
        ImageIcon icon = new ImageIcon("src/img/icon.png");
        Image image = icon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        JButton btn2 = new JButton("Regardez ce joli bouton", new ImageIcon(image));


        // Ajouter une action au bouton 1
        btn1.addActionListener(
                e -> {
                    JFrame newFrame = new JFrame("Action Bouton 1");
                    newFrame.setLayout(new BorderLayout());
                    newFrame.setSize(300, 100);

                    // Création d'un label avec le texte souhaité
                    JLabel label1 = new JLabel("Je suis un bouton simple", JLabel.CENTER);
                    newFrame.add(label1, BorderLayout.NORTH);

                    // Création d'un bouton pour fermer la fenêtre
                    JButton btnFermer = new JButton("OK");
                    newFrame.add(btnFermer, BorderLayout.SOUTH);
                    btnFermer.addActionListener(c -> {
                        newFrame.dispose();
                    });

                    // Afficher le nouveau frame
                    newFrame.setVisible(true);
            });

        // Ajouter une action au bouton 2
        btn2.addActionListener(
                e -> {
                    JFrame newFrame = new JFrame("Action Bouton 2");
                    newFrame.setLayout(new BorderLayout());
                    newFrame.setSize(300, 100);


                    // Création d'un label avec le texte souhaité
                    JLabel label12 = new JLabel("Je suis un bouton fantaisie", JLabel.CENTER);
                    newFrame.add(label12, BorderLayout.NORTH);

                    // Création d'un bouton pour fermer la fenêtre
                    JButton btnFermer = new JButton("OK");
                    newFrame.add(btnFermer, BorderLayout.SOUTH);
                    btnFermer.addActionListener(c -> {
                        newFrame.dispose();
                    });

                    // Afficher le nouveau frame
                    newFrame.setVisible(true);
                });

        // Ajouter les boutons au panel
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);

        // Ajouter label et panel au frame
        frame.setLayout(new GridLayout(2, 1));
        frame.add(label);
        frame.add(buttonPanel);

        // Afficher le frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setVisible(true);

    }

}
