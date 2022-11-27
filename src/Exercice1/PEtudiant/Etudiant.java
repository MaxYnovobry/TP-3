package Exercice1.PEtudiant;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {

    private String nom;
    private String prenom;
    private static final List<Etudiant> Notes = new ArrayList<>();

    public Etudiant (String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public static void afficherNote() {
        System.out.println("");
    }
    public static void afficherNote(String x) {
        System.out.println("");
    }

    public static int moyenne(String student) {
        var listNotes = new ArrayList<Integer>();

    }

}
