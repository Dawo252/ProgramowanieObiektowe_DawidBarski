package pl.dawidjd.Barski_lab10;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{
    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba[" +
                "nazwisko=" + nazwisko +
                ", dataUrodzenia=" + dataUrodzenia +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Osoba osoba = (Osoba) obj;
        return Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba osoba) {
        int comparison= this.nazwisko.compareTo(osoba.nazwisko);
        if(comparison==0){
            return this.dataUrodzenia.compareTo(osoba.dataUrodzenia);
        }
        return comparison;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}
