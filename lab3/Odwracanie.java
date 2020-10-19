package pl.edu.student.dawidBa.lab3;

import java.util.Random;
import java.util.Scanner;

public class Odwracanie {
    public static void main(String[] args) {
        Random generator = new Random();
        int n = generator.nextInt(30)+1;
        int[] tab = new int[n];
        for(int i = 0; i<n; i++){
            tab[i] = generator.nextInt(2000)-999;
            System.out.println(tab[i]);
        }

        System.out.println("-----------------");
        Scanner scan = new Scanner(System.in);
        int lewy = scan.nextInt();
        int prawy = scan.nextInt();
        int liczba2 = 0;
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
