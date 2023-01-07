package Exercice1.PEtudiant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant {

    public String nom;
    public String prenom;
    public Map<String, Map<String, Double>> notes;

    public Etudiant (String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new HashMap<>();
    }
    public void afficherNote() {
        for (String sujet : notes.keySet()) {
            System.out.println(sujet + " : " + notes.get(sujet));
        }
    }
    public void afficherNote(String sujet) {
        if (!notes.containsKey(sujet)) {
            System.out.println("Le sujet n'existe pas");
        } else {
            System.out.println(sujet + " : " + notes.get(sujet));
        }
    }

    public  int moyenne(String sujet) {
        if (sujet == null || sujet.isEmpty()) {
            int sum = 0;
            int count = 0;
            for (String currentSubject : notes.keySet()) {
                Map<String, Double> subjectNotes = notes.get(currentSubject);
                for (Double note : subjectNotes.values()) {
                    sum += note;
                    count++;
                }
            }
            if (count == 0) {
                return -1;
            }
            return sum / count;
        }
        if (!notes.containsKey(sujet)) {
            return -1;
        }
        Map<String, Double> subjectNotes = notes.get(sujet);
        int sum = 0;
        int count = 0;
        for (String type : subjectNotes.keySet()) {
            sum += subjectNotes.get(type);
            count++;
        }
        return sum / count;
    }
    public void setNote(String sujet, String type, double note) {
        if (!notes.containsKey(sujet)) {
            notes.put(sujet, new HashMap<>());
        }
        notes.get(sujet).put(type, note);
    }

    public void setNote(String sujet, String type, double note, double coefficient) {
        if (!notes.containsKey(sujet)) {
            notes.put(sujet, new HashMap<>());
        }
        notes.get(sujet).put(type, note * coefficient / coefficient);
    }
}
