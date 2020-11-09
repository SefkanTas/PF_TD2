package exercice_2;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class App {

    public static void question_1(){

        Paire<Integer, Double> client01 = new Paire<>(80, 120.0);
        Paire<Integer, Double> client02 = new Paire<>(120, 120.0);
        Paire<Integer, Double> client03 = new Paire<>(210, 210.0);
        Paire<Integer, Double> client04 = new Paire<>(50, 30.0);

        Predicate<Integer> tailleTropPetite = taille -> taille < 100;
        Predicate<Integer> tailleTropGrande = taille -> taille > 200;
        Predicate<Integer> tailleIncorrecte = taille -> tailleTropPetite.and(tailleTropGrande).test(taille);
        Predicate<Integer> tailleCorrect = taille -> !tailleIncorrecte.test(taille);

        Predicate<Double> poidTropLourd = poid -> poid > 150.0;
        Predicate<Double> poidCorrect = poid -> !poidTropLourd.test(poid);

        BiPredicate<Integer, Double> accesAutorise = (taille, poid)
                -> tailleCorrect.test(taille) && poidCorrect.test(poid);


        ///Question 2



    }


    public static void main(String[] args) {
        question_1();
    }
}
