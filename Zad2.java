package pl.edu.student.dawidBa.lab4;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2 {
    public static int wystapienia(String nazwapliku, char znak) throws FileNotFoundException {
        File plik = new File(nazwapliku);
        Scanner czytaniezpliku = new Scanner(plik);
        String tekst = czytaniezpliku.nextLine();
        int liczba = 0;
        for (int i = 0; i<tekst.length(); i++){
            char litera = tekst.charAt(i);
            if(litera == znak)
                liczba ++;
        }
        return liczba;
    }
}
