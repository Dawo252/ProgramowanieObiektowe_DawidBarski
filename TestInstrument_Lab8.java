package pl.imiajd.Barski_lab8;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrument_Lab8 {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("Gewa", LocalDate.of(2012, 2, 12)));
        orkiestra.add(new Fortepian("Petrof", LocalDate.of(2000, 8, 20)));
        orkiestra.add(new Skrzypce("Stradivarius", LocalDate.of(1730, 6, 17)));
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(2008, 3, 28)));
        orkiestra.add(new Skrzypce("Hofner", LocalDate.of(2000, 12, 2)));
        System.out.println(orkiestra.get(0).dzwiek());
        System.out.println(orkiestra.get(1).dzwiek());
        System.out.println(orkiestra.get(2).dzwiek());
        System.out.println(orkiestra.get(3).dzwiek());
        System.out.println(orkiestra.get(4).dzwiek());
        System.out.println(orkiestra);
    }
}