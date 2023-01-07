package Exercice1;

import Exercice1.PEtudiant.Etudiant;

public class test {

    public static void testEtudiant() {
        Etudiant etudiant1 = new Etudiant("Maxime" , "obry");
        Etudiant etudiant2 = new Etudiant("Laurie" , "Jeham");
        etudiant1.setNote("Maths", "Examen",  10);
        etudiant1.setNote("Maths", "Devoir", 8);
        etudiant1.setNote("Physique", "Examen",  9);
        etudiant1.setNote("Physique", "Devoir", 6);
        etudiant1.setNote("SVT", "Examen",  6);
        etudiant1.setNote("SVT", "Devoir", 7);
        System.out.println("\033[31mTest de la fonction moyenne :\033[0m");
        System.out.println("Moyenne de "+ etudiant1.nom + " " + etudiant1.prenom + " en Maths : " + (etudiant1.moyenne("Maths") == -1 ? "Pas de note" : etudiant1.moyenne("Maths")));
        System.out.println("Moyenne de "+ etudiant1.nom + " " + etudiant1.prenom + " en Physique : " + (etudiant1.moyenne("Physique") == -1 ? "Pas de note" : etudiant1.moyenne("Physique")));
        System.out.println("Moyenne de "+ etudiant1.nom + " " + etudiant1.prenom + " en SVT : " + (etudiant1.moyenne("SVT") == -1 ? "Pas de note" : etudiant1.moyenne("SVT")));
        System.out.println("Moyenne générale de "+ etudiant1.nom + " " + etudiant1.prenom + " : " + (etudiant1.moyenne("") == -1 ?"Pas de note" : etudiant1.moyenne("")));
        System.out.println("Moyenne générale de "+ etudiant2.nom + " " + etudiant2.prenom + " : " + (etudiant2.moyenne("") == -1 ? "Pas de note" : etudiant2.moyenne("")));
        System.out.println("\n");
        System.out.println(etudiant1.nom);
        etudiant1.afficherNote();
    }
}
