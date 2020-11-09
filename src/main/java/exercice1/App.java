package exercice1;

import java.util.List;

public class App {

    public static void question_1_1(){
        Somme<Integer> sommeEntier = (x, y) -> x + y;
        Somme<Double> sommeDouble = (x, y) -> x + y;
        Somme<Long> sommeLong = (x, y) -> x + y;
        Somme<String> sommeString = (x, y) -> x + y;


        System.out.println(sommeEntier.sommer(1,1));
        System.out.println(sommeDouble.sommer(2.0,2.0));
        System.out.println(sommeLong.sommer(4L, 4L));
        System.out.println(sommeString.sommer("x ","y"));
    }

    public static void question_1_2(){
        ToString<List> ts = (list) -> "pas le temps :(";
    }

        public static void main(String[] args) {
        question_1_1();
    }
}
