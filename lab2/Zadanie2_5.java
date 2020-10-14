package pl.edu.student.dawidBa.lab2;

import java.util.Scanner;

public class Zadanie2_5 {
    public static void Zad2_5() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double [] liczba = new double[n];
        int iloscpar = 0;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            double kolejna = scan.nextDouble();
            liczba[i] = kolejna;
        }
        for(int i = 0; i<n-1; i++){
            if(liczba[i]>0 && liczba[i+1]>0) {
                iloscpar ++;
            }
        }
        System.out.println("iloscpar = " + iloscpar);
    }
}
