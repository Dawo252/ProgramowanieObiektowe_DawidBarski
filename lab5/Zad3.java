package pl.edu.student.dawidBa.lab5;

import java.util.ArrayList;
import java.util.Collections;

public class Zad3 {

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>(a.size()+b.size());
        Collections.sort(a);
        Collections.sort(b);
        for(int i = 0; i<a.size()+b.size(); i++){
            if(i<=a.size()-1)
                c.add(a.get(i));
            if(i<=b.size()-1)
                c.add(b.get(i));
        }
        return c;
    }
}
