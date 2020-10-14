package pl.edu.student.dawidBa.lab2;

import java.util.Scanner;

public class Zadanie2 {

    public static void wypisz(double[] tabela, int a) {
        for(int i = a; i<tabela.length; i++){
            System.out.print(tabela[i]+ " ");
        }
    }

    public static void Zad2(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] tabela = new double[n];
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            double kolejna = scan.nextDouble();
            tabela[i] = kolejna;
            }
        wypisz(tabela, 1);
        System.out.print(tabela[0]);
        }
    }
