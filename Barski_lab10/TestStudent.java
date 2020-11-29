package pl.dawidjd.Barski_lab10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Student("Kowalski", LocalDate.of(2000, 12, 4), 2.8));
        grupa.add(new Student("Kowalski", LocalDate.of(1989, 8, 14), 3.5));
        grupa.add(new Student("Barski", LocalDate.of(2000, 3, 23), 2.8));
        grupa.add(new Student("Nowak", LocalDate.of(2000, 12, 4), 4.2));
        grupa.add(new Student("Nowicki", LocalDate.of(1999, 2, 6), 3.5));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
