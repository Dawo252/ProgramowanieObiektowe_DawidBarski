package pl.edu.student.dawidBa.lab5;

import java.util.ArrayList;

public class Wywolania {
    public static void main(String[] args){
        ArrayList<Integer> lista1 = new ArrayList<Integer>(3);
        ArrayList<Integer> lista2 = new ArrayList<Integer>(3);
        lista1.add(1);
        lista1.add(4);
        lista1.add(9);
        lista1.add(16);
        lista2.add(9);
        lista2.add(7);
        lista2.add(4);
        lista2.add(9);
        lista2.add(11);

        System.out.println(Zad1.append(lista1, lista2));
        System.out.println(Zad2.merge(lista1, lista2));
        System.out.println(Zad3.mergeSorted(lista1, lista2));
        System.out.println(Zad4.reversed(lista1));
        Zad5.reverse(lista1);
    }
}
