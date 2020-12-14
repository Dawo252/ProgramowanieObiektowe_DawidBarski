package pl.dawidjd.Barski_lab12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Tester {
    public static void main(String[] args){
        LinkedList<String> pracoownicy= new LinkedList<>();
        pracoownicy.add("Andrzej");
        pracoownicy.add("Stefan");
        pracoownicy.add("Lukasz");
        pracoownicy.add("Patryk");
        pracoownicy.add("Jędrzej");
        pracoownicy.add("Stanisław");
        pracoownicy.add("Eustachy");
        pracoownicy.add("Fabian");
        System.out.println(pracoownicy);
        Kolekcje.odwroc(pracoownicy);
        System.out.println(pracoownicy);

        System.out.println(Kolekcje.zdania("Ala ma kota. Jej kot lubi myszy."));
        Kolekcje.sito(20);
        Kolekcje.print(pracoownicy);
        ArrayList<LocalDate> daty = new ArrayList<>();
        daty.add(LocalDate.of(2002,3,4));
        daty.add(LocalDate.of(1989,6,2));
        daty.add(LocalDate.of(1995,2,16));
        daty.add(LocalDate.of(2079,7,20));
        daty.add(LocalDate.of(2000,11,5));
        daty.add(LocalDate.of(1999,1,7));
        daty.add(LocalDate.of(2006,8,3));
        Kolekcje.print(daty);
    }
}
