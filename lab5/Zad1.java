package pl.edu.student.dawidBa.lab5;

import java.util.ArrayList;

public class Zad1 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>(a.size()+b.size());
        for(int i = 0; i<a.size(); i++){
            c.add(a.get(i));
        }
        for(int j = 0; j<b.size(); j++){
            c.add(b.get(j));
        }
        return c;
    }
}
