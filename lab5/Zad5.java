package pl.edu.student.dawidBa.lab5;

import java.util.ArrayList;

public class Zad5 {
    public static void reverse(ArrayList<Integer> a){
        int rozmiar = a.size();
        for(int i = 0; i<a.size(); i++){
            a.add(a.get(rozmiar-i-1));
            a.remove(rozmiar-i-1);
        }
        for(int j = 0; j<a.size(); j++){
            System.out.print(a.get(j) + " ");
        }
        System.out.print("\n");
    }
}
