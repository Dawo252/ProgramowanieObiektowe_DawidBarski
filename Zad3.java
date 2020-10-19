package pl.edu.student.dawidBa.lab3;

import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        Random generator = new Random();
        //macierz a
        int[][] taba = new int[m][n];
        int[][] tabb = new int[n][k];
        int[][] tabc = new int[m][k];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                int x = generator.nextInt(100)+1;
                taba[i][j] = x;
            }
        }
        // macierz b
        for(int i = 0; i<n; i++){
            for(int j = 0; j<k; j++){
                int x = generator.nextInt(100)+1;
                tabb[i][j] = x;
            }
        }
        for(int i = 0; i<m; i++){
            System.out.print("\n");
            for(int j = 0; j<n; j++){
                    System.out.print(taba[i][j]+ " ");
                }
            }
        System.out.println("");
        System.out.println("-------------");

        for(int i = 0; i<n; i++){
            System.out.print("\n");
            for(int j = 0; j<k; j++){
                    System.out.print(tabb[i][j]+ " ");
                }
            }
        System.out.println("");
        System.out.println("-------------");
        int z = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<k; j++){
                if(z<n) {
                    tabc[i][j] = taba[i][z] * tabb[z][j];
                    z++;
                }
            }
        }
        for(int i = 0; i<m; i++){
            System.out.print("\n");
            for(int j = 0; j<k; j++){
                System.out.print(tabc[i][j]+ " ");
            }
        }

        }
    }
