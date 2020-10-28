package pl.edu.student.dawidBa.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3 {
        public static int wystapieniawyrazu(String nazwapliku, String wyraz) throws FileNotFoundException {
            File plik = new File(nazwapliku);
            Scanner czytaniezpliku = new Scanner(plik);
            String tekst = czytaniezpliku.nextLine();
            int liczba = 0;
            for (int i = 0; i<tekst.length()-wyraz.length()+1; i++) {
                    if(tekst.substring(i, i+wyraz.length()).equals(wyraz)) {
                        liczba++;
                    }
            }
            return liczba;
        }
    }

