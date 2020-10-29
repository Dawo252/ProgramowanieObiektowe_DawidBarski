package pl.edu.student.dawidBa.lab5;

import java.util.ArrayList;

public class Zad4 {

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> odwrocona = new ArrayList<Integer>(a.size());
        for(int i = 0; i<a.size(); i++){
            odwrocona.add(a.get(a.size()-i-1));
        }
        return odwrocona;
    }
}
