import src.Utils.utils;
import java.util.Scanner;


/**
 * @author : Obry Maxime and Jeham Laurie
 * Class pour créer le menu
 */
public class Menu {

    /**
     * Fonction principale du menu
     * @param args Parametre de la ligne de commande(non utilisé)
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("======== Bonjour, choisissez un exercice ========");
        System.out.println("****************************");
        System.out.println("======== Exercice 1 : Racine d'un nombre ========");

        int value = utils.entierInt();
        while (true) {
            switch (value) {
                case 1:
                    Menu.main(args);
                    break;

            }
            System.out.println("Veuillez entrer un nombre entre 1 et 6");
            Menu.main(args);
            break;
        }

    }
}

