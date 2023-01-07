package Exercice1.PClasse;


import Exercice1.PEtudiant.Etudiant;

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Classe {
    private final String nom;
    private final Map<String, Etudiant> eleves;

    public Classe(String nom) {
        this.nom = nom;
        this.eleves = new HashMap<>();
    }

    public void afficher() {
        System.out.println("La classe de " + nom + " contient " + eleves.size() + " élèves qui se nomment :");
        for (Etudiant eleve : eleves.values()) {
            System.out.println(eleve.nom + " " + eleve.prenom);
        }
    }

    public Etudiant getEtudiant(String nom){
        return eleves.get(nom);
    }

    public float moyenneClasse(String sujet) {
        float sum = 0;
        int count = 0;
        for (Etudiant etudiant : eleves.values()) {
            int moyenne = etudiant.moyenne(sujet);
            if (moyenne != -1) {
                sum += moyenne;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return sum / count;
        }

    public void setEtudiant(Etudiant eleve) {
        String eleve_nom = eleve.nom;
        String eleve_prenom = eleve.prenom;
        String nom_prenom = eleve_nom + eleve_prenom;
        eleves.put(nom_prenom, eleve);
    }

}