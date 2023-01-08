package PExo2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Selecteurcartes extends JFrame {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 100;
    private static final String TITLE = "Selecteur de cartes";

    private static final String[] CARD_FILES;

    static {
        File dir = new File("src/img/paquet_carte");
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("Repertoire existant");
            File[] files = dir.listFiles();
            if (files != null) {
                CARD_FILES = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    CARD_FILES[i] = files[i].getName();
                }
            } else {
                System.out.println("Repertoire inexistant");
                CARD_FILES = new String[0];
            }
        } else {
            System.out.println("Repertoire inexistant");
            CARD_FILES = new String[0];
        }
    }


    public Selecteurcartes() {
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setLayout(new FlowLayout());

        JButton btn1 = new JButton("Selection des cartes");
        add(btn1);
        btn1.addActionListener(
                e -> {
                    JFrame newFrame = new JFrame("Action Bouton 1");
                    newFrame.setLayout(new BorderLayout());
                    newFrame.setSize(1000, 500);

                    // Afficher le nouveau frame
                    newFrame.setVisible(true);

                    // Choix aléatoire dans dossier d'image

                    Random random = new Random();
                    for (int i = 0; i < 3; i++) {
                        int index = random.nextInt(CARD_FILES.length);
                        String fileName = CARD_FILES[index];
                        System.out.println(fileName);
                        ImageIcon icon = new ImageIcon("src/img/paquet_carte/" + fileName);
                        Image image = icon.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
                        if (i == 0) {
                            JLabel label1 = new JLabel(new ImageIcon(image));
                            newFrame.add(label1, BorderLayout.WEST);
                        } else if (i == 1) {
                            JLabel label2 = new JLabel(new ImageIcon(image));
                            newFrame.add(label2, BorderLayout.CENTER);
                        } else {
                            JLabel label3 = new JLabel(new ImageIcon(image));
                            newFrame.add(label3, BorderLayout.EAST);
                        }
                        newFrame.setVisible(true);
                    }
    });

    }

    public static void main(String[] args) {
        Selecteurcartes selector = new Selecteurcartes();
        selector.setVisible(true);
    }

}


