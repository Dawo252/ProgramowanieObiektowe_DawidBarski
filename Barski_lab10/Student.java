package pl.dawidjd.Barski_lab10;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Osoba osoba) {
        int comparison=super.compareTo((osoba));
        if((osoba instanceof Student)&&(comparison==0)){
            return -(int)Math.ceil(this.sredniaOcen-((Student) osoba).sredniaOcen);
        }
        return comparison;
    }

    @Override
    public String toString() {
            return "Osoba[" +
                    "nazwisko=" + getNazwisko() +
                    ", dataUrodzenia=" + getDataUrodzenia() +
                    ", sredniaOcen=" + sredniaOcen +
                    ']';
        }

    private double sredniaOcen;
}
