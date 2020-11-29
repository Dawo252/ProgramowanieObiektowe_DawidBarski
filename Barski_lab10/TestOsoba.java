package pl.dawidjd.Barski_lab10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Kowalski", LocalDate.of(2000, 12, 4)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(1989, 8, 14)));
        grupa.add(new Osoba("Barski", LocalDate.of(2000, 3, 23)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2000, 12, 4)));
        grupa.add(new Osoba("Nowicki", LocalDate.of(1999, 2, 6)));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
