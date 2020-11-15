package pl.imiajd.Barski_lab8;

import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalska", 3000, LocalDate.of(2020,3,7), new String[]{"Maria"}, LocalDate.of(1989,12,30), false);
        ludzie[1] = new Student("Nowak", "dziennikarstwo", 4.2, new String[]{"Dawid" ,"Marcin"}, LocalDate.of(2000,3,12), true);
        for (Osoba p : ludzie) {
            for ( String i : p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis() + " urodzony: " + p.getDataUrodzenia() + ", plec: ");
            if(p.getplec()){
                System.out.println("Mężczyzna");
            }
            else {
                System.out.println("Kobieta");
            }
        }
    }
}


