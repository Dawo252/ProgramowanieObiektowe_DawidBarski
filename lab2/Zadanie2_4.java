package pl.edu.student.dawidBa.lab2;

import java.util.Scanner;

public class Zadanie2_4 {

    public static void Zad2_4() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double [] liczba = new double[n];
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            double kolejna = scan.nextDouble();
            liczba[i] = kolejna;
        }
        double max = liczba[0];
        double min = liczba[0];
        for(int i = 0; i<n; i++){
            if(max<liczba[i]){
                max = liczba[i];
            }
            if(min>liczba[i]){
                min = liczba[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println(("min = " + min));
    }
}
