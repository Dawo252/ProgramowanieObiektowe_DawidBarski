package pl.edu.student.dawidBa.lab5;

import java.util.ArrayList;

public class Zad2 {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>(a.size()+b.size());
        for(int i = 0; i<a.size()+b.size(); i++){
            if(i<=a.size()-1)
                c.add(a.get(i));
            if(i<=b.size()-1)
                c.add(b.get(i));
        }
        return c;
    }
}
