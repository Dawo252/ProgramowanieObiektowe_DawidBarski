package pl.edu.student.dawidBa.lab2;

import java.util.Scanner;

public class Zadanie2_2 {

    public static void Zad2_2() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if (liczba > 0) {
                suma = suma + 2 * liczba;
            }
        }
        System.out.println(suma);
    }
}
