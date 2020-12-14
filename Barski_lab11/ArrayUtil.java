package pl.dawidjd.Barski_lab11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil<T> {

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> lista) {
        ArrayList lista1 = new ArrayList(lista);
        Collections.sort(lista1);
        return lista.equals(lista1);
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> lista, T element) {
        int left = 0;
        int right = lista.size() - 1;
        int searched_index = 0;
        while (left <= right) {
            searched_index = (int) Math.floor((left + right) / 2);
            if (lista.get(searched_index).compareTo(element) < 0) {
                left = searched_index + 1;
            } else if (lista.get(searched_index).compareTo(element) > 0) {
                right = searched_index - 1;
            } else {
                break;
            }
        }
        return searched_index;
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> lista) {
        T najmniejszy;
        T tmp;
        int index;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).compareTo(lista.get(j)) < 0) {
                    najmniejszy = lista.get(j);
                    index = j;
                    tmp = lista.get(i);
                    lista.set(i, najmniejszy);
                    lista.set(index, tmp);
                }
            }
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> tab){
        if (tab.size() > 1) {
            ArrayList<T> left = new ArrayList<>();
            ArrayList<T> right = new ArrayList<>();
            boolean logicalSwitch = true;
            while (!tab.isEmpty()) {
                if (logicalSwitch) {
                    left.add(tab.remove(0));
                } else {
                    right.add(tab.remove(tab.size()/2));
                }
                logicalSwitch = !logicalSwitch;
            }
            mergeSort(left);
            mergeSort(right);
            while (!left.isEmpty() && !right.isEmpty()) {
                if(left.get(0).compareTo(right.get(0)) <= 0){
                    tab.add(left.remove(0));
                }
                else {
                    tab.add(right.remove(0));
                }
            }
            if(!left.isEmpty()){
                tab.addAll(left);
            }
            else if (!right.isEmpty()){
                tab.addAll(right);
            }
        }
    }

    public static <T extends Comparable<? super T>> void pseudo_randomise(ArrayList<T> lista) {
        for (int i = lista.size() - 1  ; i > 0; i--) {
            for (int j = 0; j < lista.size() - 1; j++) {
                T tmp = lista.get(i);
                T tmp1 = lista.get(j);
                lista.set(j, tmp);
                lista.set(i, tmp1);
            }
        }
    }
}


