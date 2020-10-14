package pl.edu.student.dawidBa.lab2;

import java.util.Scanner;

public class Zadanie1 {


    /*public Zadanie1(){
                System.out.println(Zadanie1());
            }
            public static void Zadanie1(){
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                double suma = 0;
                for(int i = 0; i<n; i++){
                    //Scanner scan2 = new Scanner(System.in);
                    System.out.println("podaj liczbę");
                    double liczba = scan.nextDouble();
                    suma = suma + liczba;
                }
                return suma;
            }*/
    public static void A(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double suma = 0;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma + liczba;
        }
        System.out.println(suma);
    }
    public static void B(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double iloczyn = 1;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            iloczyn = iloczyn * liczba;
        }
        System.out.println(iloczyn);
    }
    public static void C(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sumabez = 0;
        for(int i = 0; i<n; i++){
            //Scanner scan2 = new Scanner(System.in);
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            sumabez = sumabez + Math.abs(liczba);
        }
        System.out.println(sumabez);
    }
    public static void D(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sumabez = 0;
        for(int i = 0; i<n; i++){
            //Scanner scan2 = new Scanner(System.in);
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            sumabez = sumabez + Math.sqrt(Math.abs(liczba));
        }
        System.out.println(sumabez);
    }
    public static void E(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double iloczynbez = 1;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            iloczynbez = iloczynbez * Math.abs(liczba);
        }
        System.out.println(iloczynbez);
    }
    public static void F(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sumakw = 0;
        for(int i = 0; i<n; i++){
            //Scanner scan2 = new Scanner(System.in);
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            sumakw = sumakw + Math.pow(liczba, 2);
        }
        System.out.println(sumakw);
    }
    public static void G(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double suma = 0;
        double iloczyn = 1;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma + liczba;
            iloczyn = iloczyn * liczba;
        }
        System.out.println("iloczyn = " + iloczyn);
        System.out.println("suma = " + suma);
    }
    public static void H(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double suma = 0;
        for(int i = 1; i<=n; i++){
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma + (Math.pow(-1,i+1)*liczba);
        }
        System.out.println("suma = " + suma);
    }
    public static long Silnia(int n) {
        long silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    public static void I(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double suma = 0;
        for(int i = 1; i<=n; i++){
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma + ((Math.pow(-1,i)*liczba)/(Silnia(i)));
        }
        System.out.println("suma = " + suma);
    }
    }


