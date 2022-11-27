package Exercice1.PClasse;


import Exercice1.PEtudiant.Etudiant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classe extends Etudiant {

    private int nbEtudiant;
    private static final List<Etudiant> students = new ArrayList<>();

    public Classe(String nom, String prenom) {
        super(nom, prenom);
    }

    public static void afficher() {
        System.out.println("Classe");
    }
    public static Etudiant getEtudiant(String nom, String prenom) {

    }
    public static float moyenneClasse(String xxx) {
        return xxx; 
    }
    public static void setEtudiant(Etudiant nom) {
        students.add(nom);
    }
}
