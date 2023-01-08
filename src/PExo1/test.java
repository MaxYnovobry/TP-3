package PExo1;

import java.io.IOException;

public class test {

    public static void
    testEtudiant() throws IOException {
        Etudiant etudiant1 = new Etudiant("Maxime", "obry");
        Etudiant etudiant2 = new Etudiant("Laurie", "Jeham");
        etudiant1.setNote("C++", "Examen", 10);
        etudiant1.setNote("C++", "Devoir", 8, 2);
        etudiant1.setNote("Linux", "Examen", 9);
        etudiant1.setNote("Infra", "Examen", 6);
        etudiant1.setNote("Infra", "Devoir", 7, 2);
        etudiant2.setNote("C++", "Examen", 15, 2);
        etudiant2.setNote("C++", "Devoir", 10, 4);
        System.out.println("moyenne");
        etudiant1.afficherNote("C++");
        System.out.println("Moyenne de " + etudiant1.nom + " " + etudiant1.prenom + " en C++ : " + (etudiant1.moyenne("C++") == -1 ? "Pas de note" : etudiant1.moyenne("C++")));
        System.out.println("Moyenne de " + etudiant1.nom + " " + etudiant1.prenom + " en Linux : " + (etudiant1.moyenne("Linux") == -1 ? "Pas de note" : etudiant1.moyenne("Linux")));
        System.out.println("Moyenne de " + etudiant1.nom + " " + etudiant1.prenom + " en Infra : " + (etudiant1.moyenne("Infra") == -1 ? "Pas de note" : etudiant1.moyenne("Infra")));
        System.out.println("Moyenne générale de " + etudiant1.nom + " " + etudiant1.prenom + " : " + (etudiant1.moyenne("") == -1 ? "Pas de note" : etudiant1.moyenne("")));
        System.out.println("Moyenne générale de " + etudiant2.nom + " " + etudiant2.prenom + " : " + (etudiant2.moyenne("") == -1 ? "Pas de note" : etudiant2.moyenne("")));
        System.out.println(etudiant1.nom);
        etudiant1.afficherNote();


        Classe class1 = new Classe("1ere");
        class1.setEtudiant(etudiant1);
        class1.setEtudiant(etudiant2);
        class1.afficher();
        System.out.println(class1.moyenneClasse(""));

        class1.saveInFiles("listeEtudiant.txt");
        class1.readFromFile("listeEtudiant.txt");
    }
}

