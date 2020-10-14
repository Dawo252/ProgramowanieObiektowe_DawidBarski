package pl.edu.student.dawidBa.lab2;

import java.util.Scanner;

public class Zadanie2_3 {

    public static void Zad2_3(){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int dodatnie = 0;
    int zera = 0;
    int ujemne = 0;
        for(int i = 0; i<n; i++){
        System.out.println("podaj liczbę");
        double liczba = scan.nextDouble();
        if(liczba>0) {
            dodatnie ++;
        }
        else if(liczba<0){
            ujemne ++;
        }
        else{
            zera ++;
        }
    }
        System.out.println("dodatnie = " + dodatnie + " zera = " + zera + " ujemne = " + ujemne);
}
}
