package pl.edu.student.dawidBa.lab3;

import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Random generator = new Random();
        int n = generator.nextInt(100)+1;
        int[] tab = new int[n];
        for(int i = 0; i<n; i++){
            tab[i] = generator.nextInt(2000)-999;
            System.out.println(tab[i]);
        }
        //a
        int nieparzyste = 0;
        int parzyste = 0;
        for (int i : tab) {
            if (i % 2 == 1) {
                nieparzyste += 1;
            } else {
                parzyste += 1;
            }
        }
        System.out.println("nieparzyste = "+ nieparzyste + " parzyste = "+ parzyste);
        //b
        int ujemne = 0;
        int zerowe = 0;
        int dodatnie = 0;
        for (int i : tab) {
            if (i < 0) {
                ujemne += 1;
            } else if (i > 0) {
                dodatnie += 1;
            } else {
                zerowe += 1;
            }
        }
        System.out.println("ujemne = "+ ujemne + " zerowe = "+ zerowe + " dodatnie = " + dodatnie);
        //c
        int najwieksza = tab[0];
        int ilosc = 0;
        for (int j : tab) {
            if (j > najwieksza) {
                najwieksza = j;
            }
        }
        for (int j : tab) {
            if (j == najwieksza)
                ilosc += 1;
        }
        System.out.printf("najwieksza to: %d i wystepuje: %d razy \n", najwieksza, ilosc);
        //d
        int suma_d = 0;
        int suma_u = 0;
        for(int i : tab){
            if(i > 0){
                suma_d += i;
            }
            else if(i < 0){
                suma_u += i;
            }
        }
        System.out.printf("suma dodatnich to: %d suma ujemnych to: %d \n", suma_d, suma_u);
        //e
        int dlugosc = 0;
        int dlugosc2 = 0;
        for (int j : tab) {
            if (j > 0) {
                dlugosc += 1;
            } else if (j < 0) {
                if (dlugosc >= dlugosc2) {
                    dlugosc2 = dlugosc;
                }
                dlugosc = 0;
            }
        }
        System.out.printf("dlugosc dodatniego fragmentu to: %d \n", dlugosc2);
        //f
        for(int i : tab) {
            if (i > 0) {
                i = 1;
            } else if (i < 0) {
                i = -1;
            }
            System.out.println(i);
        }
        //g
        Scanner scan = new Scanner(System.in);
        int lewy = scan.nextInt();
        int prawy = scan.nextInt();
        int liczba2=0;
        while(lewy >= tab.length || prawy >= tab.length){
            System.out.println("podaj inne liczby");
            lewy = scan.nextInt();
            prawy = scan.nextInt();
        }
        for (int i = lewy; i <= prawy; i++) {
            liczba2 = tab[i];
            tab[i] = tab[prawy];
            tab[prawy] = liczba2;
            prawy--;
        }
        for(int x = 0; x<tab.length; x++){
            System.out.println(tab[x]);
        }
}
}
