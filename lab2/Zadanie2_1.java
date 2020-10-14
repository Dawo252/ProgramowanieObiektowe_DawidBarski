package pl.edu.student.dawidBa.lab2;
import java.util.Scanner;
public class Zadanie2_1 {

    public static void A(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nieparzyste = 0;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            int liczba = scan.nextInt();
            if(liczba % 2 == 1){
                nieparzyste += 1;
            }
        }
        System.out.println(nieparzyste);
    }
    public static void B(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nieparzyste = 0;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            int liczba = scan.nextInt();
            if((liczba % 3 == 0) && (liczba % 5 != 0)){
                nieparzyste += 1;
            }
        }
        System.out.println(nieparzyste);
    }
    public static void C(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int kwparzystej = 0;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            int liczba = scan.nextInt();
            if(Math.sqrt(liczba) % 2 == 0){
                kwparzystej += 1;
            }
        }
        System.out.println(kwparzystej);
    }
    public static void D(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] liczba = new int[n];
        int ile = 0;
        for(int i=0;i<n;i++){
            System.out.println("podaj liczbę");
            int kolejna = scan.nextInt();
            liczba[i] = kolejna;
        }
        for(int i = 2; i<n-1; i++){
            if(liczba[i]<((liczba[i-1]+liczba[i+1])/2)){
                ile += 1;
            }
        }
        System.out.println(ile);
    }
    public static long Silnia(int n) {
        long silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }
    public static void E(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] liczba = new int[n];
        int ile = 0;
        for(int i = 1; i<=n; i++){
            System.out.println("podaj liczbę");
            int kolejna = scan.nextInt();
            liczba[i-1] = kolejna;
            if((liczba[i-1] > Math.pow(2,i))&&(liczba[i-1] < Silnia(i))){
                ile += 1;
            }
        }
        System.out.println(ile);
    }
    public static void F(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] liczba = new int[n];
        int ile = 0;
        for(int i = 1; i<=n; i++){
            System.out.println("podaj liczbę");
            int kolejna = scan.nextInt();
            liczba[i-1] = kolejna;
            if((i%2==1)&&(liczba[i-1]%2==0)){
                ile += 1;
            }
        }
        System.out.println(ile);
    }
    public static void G(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nieparzyste = 0;
        for(int i = 0; i<n; i++){
            System.out.println("podaj liczbę");
            int liczba = scan.nextInt();
            if((liczba % 2 == 1) &&(liczba >= 0)){
                nieparzyste += 1;
            }
        }
        System.out.println(nieparzyste);
    }
    public static void H(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ile = 0;
        for(int i = 1; i<=n; i++){
            System.out.println("podaj liczbę");
            int liczba = scan.nextInt();
            if(Math.abs(liczba)<Math.pow(i,2)){
                ile += 1;
            }
        }
        System.out.println(ile);
    }
    }

