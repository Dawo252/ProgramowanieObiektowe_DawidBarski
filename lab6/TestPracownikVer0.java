package pl.edu.student.dawidBa.lab6;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class TestPracownikVer0 {

    public static void main(String[] args) {
        Pracownik[] personel = new Pracownik[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);

        // zwiększ pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

    }
}

class Pracownik {

    public Pracownik(String nazwisko, double pobory, int year, int month, int day) {
        this.nazwisko = nazwisko;
        this.pobory = pobory;

        // klasa GregorianCalendar numeruje miesiące począwszy od 0
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);

        dataZatrudnienia = LocalDate.now();
        // dataZatrudnienia = new Date(year, month, day);
        // Powyższy konstruktor jest metodą odradzaną (ang. deprecated)
    }

    public String nazwisko() {
        return nazwisko;
    }

    public double pobory() {
        return pobory;
    }

    public LocalDate dataZatrudnienia() {
        // poniższa instrukcja umożliwia złamanie zasady hermetyzacji
        return dataZatrudnienia;

        // poprawna instrukcja:
        // return (Date) dataZatrudnienia.clone();
    }

    public void zwiekszPobory(double procent) {
        double podwyzka = pobory * procent / 100;
        pobory += podwyzka;
    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;
}