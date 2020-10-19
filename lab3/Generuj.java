package pl.edu.student.dawidBa.lab3;

import java.util.Random;

public class Generuj {

    public static void generuj(int[] tab, int minWartosc, int maxWartosc){
        Random r = new Random();
        for(int j = 0; j<tab.length; j++){
            tab[j] = r.nextInt(maxWartosc-minWartosc)+minWartosc;
        }
    }
}
