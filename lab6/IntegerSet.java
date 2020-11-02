package pl.edu.student.dawidBa.lab6;

import java.util.Arrays;

public class IntegerSet {

    boolean[] tablica = new boolean[99];

    IntegerSet(){
        for(int i = 0; i< tablica.length; i++){
            tablica[i] = false;
        }
    }

    private static int dlugosc (boolean[] tab){
        int dlug = 0;
        for(int i = 0; i<tab.length; i++){
            if(tab[i] == true)
                dlug++;
        }
        return dlug;
    }

    private static boolean sprawdzCzyByl (int liczba, int[] tab){
        int sprawdz = 0;
        for(int i = 0; i<tab.length; i++){
            if(liczba != tab[i]){
                sprawdz++;
            }
        }
        if(sprawdz == tab.length)
            return false;
        else
            return true;
    }

    //public static int[] union(boolean[] tab1, boolean[] tab2){
        //int[] nowaTablica = new int[dlugosc(tab1) + dlugosc(tab2)];
        //int numertab1 = 0;
        //int numertab2 = dlugosc(tab1);
        //for(int i = 0; i<tab1.length+tab2.length-2; i++) {
            //if((tab1[i] == true) && (sprawdzCzyByl(i, nowaTablica) == false) && (i< tab1.length) ) {
                //nowaTablica[numertab1] = i;
                //numertab1++;
            //}
            //else if((tab2[i-99] == true) && (sprawdzCzyByl(i, nowaTablica) == false)){
                //nowaTablica[numertab2] = i-99;
                //numertab1++;
            //}
        //}
        //return nowaTablica;
    //}

    public static int[] union(boolean[] tab1, boolean[] tab2){
        boolean[] nowaTablica1 = new boolean[tab1.length + tab2.length];
        int[] nowaTablica = new int[dlugosc(tab1) + dlugosc(tab2)];
        int numertab = 0;
        for(int i = 0; i<tab1.length + tab2.length; i++){
            if(i<tab1.length)
                nowaTablica1[i] = tab1[i];
            else
                nowaTablica1[i] = tab2[i-99];
        }
        for(int j = 0; j<tab1.length + tab2.length; j++){
            if(nowaTablica1[j] == true) {
                if(j >= 100 && sprawdzCzyByl(j-99, nowaTablica) == false) {
                    nowaTablica[numertab] = j - 99;
                }
                else if(j<100 && sprawdzCzyByl(j, nowaTablica) == false) {
                    nowaTablica[numertab] = j;
                }
                else{
                    numertab--;
                }
                numertab++;
            }
        }
        return nowaTablica;
    }

    public static int[] intersection(boolean[] tab1, boolean[] tab2){
        int[] nowaTablica = new int[dlugosc(tab1) + dlugosc(tab2)];
        int numertab = 0;
        for(int x = 0; x<tab1.length; x++){
            if(tab1[x] == true &&  tab2[x] == true) {
                nowaTablica[numertab] = x;
                numertab++;
            }
        }
        return nowaTablica;
    }

    public void insertElement(int liczba){
        tablica[liczba] = true;
    }

    public void deleteElement(int liczba){
        tablica[liczba] = false;
    }

    @Override
    public String toString(){
        String lista = "";
        for(int i = 0; i< tablica.length; i++) {
            if (tablica[i] == true) {
                lista = lista + i + " ";
            }
        }
        return lista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return Arrays.equals(tablica, that.tablica);
    }
}
