package pl.dawidjd.Barski_lab11;

import java.util.ArrayList;

public class Tester {
    //Zad5
    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        lista.add(7);
        lista.add(4);
        lista.add(1);
        lista.add(2);
        lista.add(6);
        lista.add(9);
        lista.add(3);
        lista.add(5);
        System.out.println(lista);

        ArrayUtil.selectionSort(lista);
        System.out.println(lista);

        ArrayUtil.pseudo_randomise(lista);
        System.out.println(lista);
        //Zad6
        ArrayUtil.mergeSort(lista);
        System.out.println(lista);
    }
}
