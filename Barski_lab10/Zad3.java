package pl.dawidjd.Barski_lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> lista = new ArrayList<>();

        File plik = new File("C:/Users/ardik/IdeaProjects/lab_2/src/pl/dawidjd/Barski_lab10/costam.txt");
        Scanner odczyt = new Scanner(plik);
        while(odczyt.hasNextLine()){
            lista.add(odczyt.nextLine());
        }
        System.out.println(lista);
    }
}
