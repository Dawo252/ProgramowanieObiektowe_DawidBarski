package pl.edu.student.dawidBa.lab4;

import java.io.FileNotFoundException;

public class Wywolania_lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Zad1.countSubStr("aaa", "aa"));
        System.out.println(Zad1.middle("slowoo"));
        System.out.println(Zad1.repeat("ho", 3));
        int[] tablica = Zad1.where("aaa", "aa");
        for(int i = 0; i< tablica.length; i++){
            System.out.print(tablica[i]+" ");
        }
        System.out.print("\n");
        System.out.println(Zad1.change("SLowO"));
        System.out.println(Zad1.nice("2345678"));
        System.out.println(Zad1.nice("2345678", 4, ";"));
        System.out.println(Zad2.wystapienia( "C:/Users/ardik/IdeaProjects/lab_2/src/pl/edu/student/dawidBa/lab4/ala.txt", 'o'));
        System.out.println(Zad3.wystapieniawyrazu("C:/Users/ardik/IdeaProjects/lab_2/src/pl/edu/student/dawidBa/lab4/ala.txt", "wo"));
        System.out.println(Zad4.Szachownica(5));
        System.out.println(Zad5.lokata(10000, 3.0, 3));
    }
}
